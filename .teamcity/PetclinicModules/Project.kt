package PetclinicModules

import PetclinicModules.buildTypes.*
import PetclinicModules.vcsRoots.*
import PetclinicModules.vcsRoots.PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "269e1e6e-1ad6-4fba-b019-c13417ec561d"
    id = "PetclinicModules"
    parentId = "_Root"
    name = "Petclinic Modules"

    vcsRoot(PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster)

    buildType(PetclinicModules_Build)

    features {
        feature {
            id = "PROJECT_EXT_3"
            type = "storage_settings"
            param("secure:aws.secret.access.key", "credentialsJSON:b7d16088-a5c7-4bad-b0f8-6acec3833bff")
            param("aws.external.id", "TeamCity-server-63ec393d-3f31-4b6e-bf2a-035ee247f58e")
            param("storage.name", "S3")
            param("storage.s3.bucket.name", "teamcity-storage-anton")
            param("storage.type", "S3_storage")
            param("aws.access.key.id", "AKIAJYULYIVA4MVKZ2UA")
            param("aws.credentials.type", "aws.access.keys")
            param("aws.region.name", "eu-west-2")
        }
        feature {
            id = "PROJECT_EXT_4"
            type = "active_storage"
            param("active.storage.feature.id", "PROJECT_EXT_3")
        }
        versionedSettings {
            id = "PROJECT_EXT_5"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
