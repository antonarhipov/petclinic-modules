package Petclinic

import Petclinic.buildTypes.*
import Petclinic.vcsRoots.*
import Petclinic.vcsRoots.Petclinic_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "9a5d3bd1-7892-47a7-8d30-c7a37560748b"
    id = "Petclinic"
    parentId = "_Root"
    name = "Petclinic"

    vcsRoot(Petclinic_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster)

    buildType(Petclinic_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_10"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = Petclinic_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
