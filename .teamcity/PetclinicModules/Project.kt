package PetclinicModules

import PetclinicModules.buildTypes.*
import PetclinicModules.vcsRoots.*
import PetclinicModules.vcsRoots.PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "0b42542b-ebd2-4e58-828e-86622e96e860"
    id = "PetclinicModules"
    parentId = "_Root"
    name = "Petclinic Modules"

    vcsRoot(PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster)

    buildType(PetclinicModules_Build)

    features {
        feature {
            id = "PROJECT_EXT_11"
            type = "CloudImage"
            param("cluster", "default")
            param("assignPublicIp", "true")
            param("profileId", "awsecs-3")
            param("agent_pool_id", "-2")
            param("subnets", "subnet-930ede9c")
            param("taskDefinition", "teamcity-agent")
            param("maxInstances", "3")
            param("source-id", "1")
            param("launchType", "FARGATE")
        }
        feature {
            id = "PROJECT_EXT_12"
            type = "storage_settings"
            param("secure:aws.secret.access.key", "credentialsJSON:22927278-f3f9-4462-a1de-b6e53147ebc2")
            param("aws.external.id", "TeamCity-server-63ec393d-3f31-4b6e-bf2a-035ee247f58e")
            param("storage.s3.bucket.name", "teamcity-storage-anton")
            param("storage.type", "S3_storage")
            param("aws.access.key.id", "AKIAJYULYIVA4MVKZ2UA")
            param("aws.credentials.type", "aws.access.keys")
            param("aws.region.name", "eu-west-2")
        }
        feature {
            id = "PROJECT_EXT_13"
            type = "active_storage"
            param("active.storage.feature.id", "PROJECT_EXT_12")
        }
        versionedSettings {
            id = "PROJECT_EXT_14"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster.id
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
        feature {
            id = "awsecs-3"
            type = "CloudProfile"
            param("secure:aws.secret.access.key", "credentialsJSON:22927278-f3f9-4462-a1de-b6e53147ebc2")
            param("aws.external.id", "TeamCity-server-63ec393d-3f31-4b6e-bf2a-035ee247f58e")
            param("profileServerUrl", "")
            param("system.cloud.profile_id", "awsecs-3")
            param("total-work-time", "")
            param("aws.region.name", "us-east-1")
            param("description", "")
            param("cloud-code", "awsecs")
            param("enabled", "true")
            param("agentPushPreset", "")
            param("profileInstanceLimit", "")
            param("profileId", "awsecs-3")
            param("name", "ecs")
            param("aws.access.key.id", "AKIAJYULYIVA4MVKZ2UA")
            param("aws.credentials.type", "aws.access.keys")
            param("next-hour", "")
            param("terminate-idle-time", "30")
            param("aws.iam.role.arn", "")
        }
    }
})
