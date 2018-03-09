package PetclinicModules.patches.projects

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the project with uuid = '0b42542b-ebd2-4e58-828e-86622e96e860' (id = 'PetclinicModules')
accordingly and delete the patch script.
*/
changeProject("0b42542b-ebd2-4e58-828e-86622e96e860") {
    features {
        remove {
            feature {
                type = "storage_settings"
                id = "PROJECT_EXT_12"
                param("aws.access.key.id", "AKIAJYULYIVA4MVKZ2UA")
                param("aws.credentials.type", "aws.access.keys")
                param("aws.external.id", "TeamCity-server-63ec393d-3f31-4b6e-bf2a-035ee247f58e")
                param("aws.region.name", "eu-west-2")
                param("secure:aws.secret.access.key", "credentialsJSON:22927278-f3f9-4462-a1de-b6e53147ebc2")
                param("storage.s3.bucket.name", "teamcity-storage-anton")
                param("storage.type", "S3_storage")
            }
        }
        remove {
            feature {
                type = "active_storage"
                id = "PROJECT_EXT_13"
                param("active.storage.feature.id", "PROJECT_EXT_12")
            }
        }
    }
}