// Suppresses warnings from Gradle/Kotlin APIs that are technically incubating or unstable.
@file:Suppress("UnstableApiUsage")

plugins {
    // Loom compatibility layer used by Stonecutter/Kikugie projects.
    // This is what gives you Minecraft/Fabric build support through Loom.
    id("dev.kikugie.loom-back-compat")

    // Post-processes JSON language files.
    // Usually used to keep generated lang files formatted consistently.
    id("dev.kikugie.postprocess.jsonlang")

    // Adds the `publishMods` block used later for Modrinth/CurseForge-style publishing.
    id("me.modmuss50.mod-publish-plugin")
}

/**
 * Configure the resource-processing task.
 *
 * processResources copies resources into the build output before the jar is made.
 * This block also expands placeholders in metadata files like fabric.mod.json.
 */
tasks.named<ProcessResources>("processResources") {
    // Helper function to read a Gradle property as a String.
    fun prop(name: String) = project.property(name) as String

    // Values that will replace placeholders in fabric.mod.json / mods.toml.
    //
    // For example, if fabric.mod.json contains:
    //
    //   "version": "${version}"
    //
    // then Gradle replaces it with:
    //
    //   mod.version + "+" + deps.minecraft
    val props = HashMap<String, String>().apply {
        this["version"] = prop("mod.version") + "+" + prop("deps.minecraft")
        this["minecraft_version_range"] = prop("mod.mc_dep_fabric")
        this["mod_name"] = prop("mod.name")
        this["mod_description"] = prop("mod.description")
        this["mod_license"] = prop("mod.license")
    }

    // Apply the placeholder expansion to these metadata files, if present.
    //
    // In the Fabric build, neoforge.mods.toml is later excluded,
    // so including it here is not harmful but is a little redundant.
    filesMatching(listOf("fabric.mod.json", "META-INF/neoforge.mods.toml")) {
        expand(props)
    }
}

// Sets the Gradle project version.
// This becomes something like:
//   1.0.0+1.21.6-fabric
version = "${property("mod.version")}+${property("deps.minecraft")}-fabric"

// Sets the base name of the generated archive.
// For example, if mod.id = smcm, your jar starts with smcm-...
base.archivesName = property("mod.id") as String

loom {
    // Points Loom at your access widener / class tweaker file.
    //
    // Your file is named `.classtweaker`, which is used by newer Loom/Stonecutter setups.
    // This file must be present in resources so it is packaged into the mod jar.
    accessWidenerPath = rootProject.file("src/main/resources/${property("mod.id")}.classtweaker")
}

sourceSets["main"].resources {
    srcDir("$rootDir/src/main/generated/resources")
}

jsonlang {
    // Tells the jsonlang postprocessor where your lang files are.
    languageDirectories = listOf("assets/${property("mod.id")}/lang")

    // Makes generated/processed lang JSON easier to read.
    prettyPrint = true
}

repositories {
    // Each maven block adds a repository Gradle can download dependencies from.
    //
    // The `content {}` filters are good practice:
    // they limit which dependency groups Gradle is allowed to fetch from each repo.
    // This reduces accidental dependency resolution from the wrong repository.

    maven {
        name = "shedaniel (Cloth Config)"
        url = uri("https://maven.shedaniel.me/")
        content {
            includeGroupAndSubgroups("me.shedaniel")
        }
    }

    maven {
        name = "Terraformers (Mod Menu)"
        url = uri("https://maven.terraformersmc.com/releases/")
        content {
            includeGroupAndSubgroups("com.terraformersmc")
            includeGroupAndSubgroups("dev.emi")
        }
    }

    maven {
        name = "Wisp Forest Maven"
        url = uri("https://maven.wispforest.io/releases/")
        content {
            includeGroupAndSubgroups("io.wispforest")
        }
    }

    maven {
        name = "Modrinth"
        url = uri("https://api.modrinth.com/maven")
        content {
            includeGroupAndSubgroups("maven.modrinth")
        }
    }

    maven {
        name = "WTHIT"
        url = uri("https://maven2.bai.lol")
        content {
            includeGroupAndSubgroups("mcp.mobius.waila")
            includeGroupAndSubgroups("lol.bai")
        }
    }

    maven {
        name = "Sisby Maven"
        url = uri("https://repo.sleeping.town/")
        content {
            includeGroupAndSubgroups("folk.sisby")
        }
    }

    maven {
        name = "Parchment Mappings"
        url = uri("https://maven.parchmentmc.org")
        content {
            includeGroupAndSubgroups("org.parchmentmc")
        }
    }

    maven {
        name = "Xander Maven"
        url = uri("https://maven.isxander.dev/releases")
        content {
            includeGroupAndSubgroups("dev.isxander")
            includeGroupAndSubgroups("org.quiltmc.parsers")
        }
    }

    maven {
        name = "Nucleoid Maven (Polymer/Trinkets)"
        url = uri("https://maven.nucleoid.xyz")
        content {
            includeGroupAndSubgroups("eu.pb4")
            includeGroupAndSubgroups("xyz.nucleoid")
        }
    }

    maven {
        name = "Fuzs Mod Resources"
        url = uri("https://raw.githubusercontent.com/Fuzss/modresources/main/maven/")
        content {
            includeGroupAndSubgroups("fuzs")
        }
    }

    maven {
        name = "Architectury"
        url = uri("https://maven.architectury.dev/")
        content {
            includeGroup("dev.architectury")
        }
    }

    maven {
        name = "Jitpack"
        url = uri("https://jitpack.io")
        content {
            includeGroup("com.github.Chocohead")
        }
    }

    // exclusiveContent means:
    // only dependencies matching this filter are allowed to resolve from this repo.
    exclusiveContent {
        forRepository {
            maven {
                name = "Cassian's Maven"
                url = uri("https://maven.cassian.cc")
            }
        }
        filter {
            includeGroupAndSubgroups("cc.cassian")
        }
    }

    // Standard Maven Central fallback.
    mavenCentral()
}

dependencies {
    // The target Minecraft version.
    minecraft("com.mojang:minecraft:${property("deps.minecraft")}")

    // Applies Mojang official mappings through your Loom compatibility helper.
    loomx.applyMojangMappings()

    // Fabric Loader dependency.
    implementation("net.fabricmc:fabric-loader:${property("deps.fabric-loader")}")

    // Fabric API dependency.
    implementation("net.fabricmc.fabric-api:fabric-api:${property("deps.fabric_api")}")

    implementation("maven.modrinth:lithostitched:1.7.11-fabric-26.2")

    // Architectury API for Fabric.
    //
    // `api` means consumers of this module also see this dependency.
    // For a mod project, this is usually okay if your common/platform code exposes Architectury types.
    api("dev.architectury:architectury-fabric:${property("deps.architectury")}")

    // Optional local runtime dependency for development only.
    // This does not become a required dependency of your mod jar.
    if (hasProperty("deps.modmenu"))
        localRuntime("com.terraformersmc:modmenu:${property("deps.modmenu")}")
}

configurations.all {
    resolutionStrategy {
        // Forces Gradle to use the exact Fabric Loader/Fabric API versions from gradle.properties.
        //
        // This can help prevent transitive dependencies from pulling mismatched versions.
        force("net.fabricmc:fabric-loader:${property("deps.fabric-loader")}")
        force("net.fabricmc.fabric-api:fabric-api:${property("deps.fabric_api")}")
    }
}

fabricApi {
    configureDataGeneration() {
        outputDirectory = file("$rootDir/src/main/generated/resources")
        client = true
    }
}

// Ensures resource processing waits for Stonecutter's generation task.
//
// This matters if Stonecutter generates version-specific files that need to be
// included or processed as resources.
tasks.named("processResources") {
    dependsOn(":${stonecutter.current.project}:stonecutterGenerate")
}

tasks {
    processResources {
        // Fabric jars should not include NeoForge metadata.
        exclude("**/neoforge.mods.toml")
    }

    // Custom helper task:
    // builds the mod, then copies the finished mod jar into a shared root build/libs folder.
    register<Copy>("buildAndCollect") {
        group = "build"

        // Copy the remapped/mod jar produced by Loom.
        from(loomx.modJar.map { it.archiveFile })

        // Put collected jars under:
        // root build/libs/<mod.version>/
        into(rootProject.layout.buildDirectory.file("libs/${project.property("mod.version")}"))

        // Make sure the normal build runs first.
        dependsOn("build")
    }
}

java {
    // Also build a sources jar.
    withSourcesJar()

    // Select Java version based on Minecraft/Stonecutter version.
    //
    // Minecraft 26+ apparently uses Java 25 in your setup.
    // Minecraft 1.21+ uses Java 21.
    // Older versions use Java 17.
    val javaCompat = if (stonecutter.eval(stonecutter.current.version, ">=26")) {
        JavaVersion.VERSION_25
    } else if (stonecutter.eval(stonecutter.current.version, ">=1.21")) {
        JavaVersion.VERSION_21
    } else {
        JavaVersion.VERSION_17
    }

    sourceCompatibility = javaCompat
    targetCompatibility = javaCompat
}

// Optional comma-separated extra Minecraft versions for publishing.
// Example:
//   publish.additionalVersions=1.21.7,1.21.8
val additionalVersionsStr = findProperty("publish.additionalVersions") as String?

val additionalVersions: List<String> = additionalVersionsStr
    ?.split(",")
    ?.map { it.trim() }
    ?.filter { it.isNotEmpty() }
    ?: emptyList()

publishMods {
    // Main file uploaded to Modrinth/other configured publishing targets.
    file = loomx.modJar.map { it.archiveFile.get() }

    // Upload the sources jar as an additional file.
    additionalFiles.from(loomx.modSourcesJar.map { it.archiveFile.get() })

    // Release type.
    type = STABLE

    // Human-readable version name.
    displayName = "${property("mod.name")} ${property("mod.version")} for ${stonecutter.current.version} Fabric"

    // Machine-readable version string.
    version = "${property("mod.version")}+${property("deps.minecraft")}-fabric"

    // Reads changelog text from the root changelog file.
    changelog = provider { rootProject.file("CHANGELOG-LATEST.md").readText() }

    // Declares this upload as a Fabric version.
    modLoaders.add("fabric")

    modrinth {
        // Modrinth project ID from gradle.properties.
        projectId = property("publish.modrinth") as String

        // API token from environment variable.
        accessToken = env.MODRINTH_API_KEY.orNull()

        // Primary Minecraft version.
        minecraftVersions.add(property("deps.minecraft") as String)

        // Optional extra compatible Minecraft versions.
        minecraftVersions.addAll(additionalVersions)

        // Declares Fabric API as a required dependency on Modrinth.
        requires("fabric-api")
    }
}