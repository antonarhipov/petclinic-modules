package PetclinicModules.patches.projects

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the project with uuid = '269e1e6e-1ad6-4fba-b019-c13417ec561d' (id = 'PetclinicModules')
accordingly and delete the patch script.
*/
changeProject("269e1e6e-1ad6-4fba-b019-c13417ec561d") {
    features {
        add {
            feature {
                type = "CloudImage"
                id = "PROJECT_EXT_6"
                param("cpuReservationLimit", "90")
                param("cluster", "")
                param("agentNamePrefix", "")
                param("profileId", "awsecs-2")
                param("agent_pool_id", "-2")
                param("subnets", """
                    subnet-tc1
                    subnet-tc2
                """.trimIndent())
                param("taskDefinition", "teamcity-agent")
                param("maxInstances", "3")
                param("source-id", "1")
                param("launchType", "FARGATE")
                param("taskGroup", "")
            }
        }
        add {
            feature {
                type = "CloudProfile"
                id = "awsecs-2"
                param("secure:aws.secret.access.key", "credentialsJSON:b7d16088-a5c7-4bad-b0f8-6acec3833bff")
                param("aws.external.id", "TeamCity-server-63ec393d-3f31-4b6e-bf2a-035ee247f58e")
                param("profileServerUrl", "")
                param("system.cloud.profile_id", "awsecs-2")
                param("total-work-time", "")
                param("aws.region.name", "eu-central-1")
                param("description", "")
                param("cloud-code", "awsecs")
                param("enabled", "true")
                param("agentPushPreset", "")
                param("profileInstanceLimit", "")
                param("profileId", "awsecs-2")
                param("name", "esc")
                param("aws.access.key.id", "AKIAJYULYIVA4MVKZ2UA")
                param("aws.credentials.type", "aws.access.keys")
                param("next-hour", "")
                param("terminate-idle-time", "30")
                param("aws.iam.role.arn", "")
            }
        }
    }
}
