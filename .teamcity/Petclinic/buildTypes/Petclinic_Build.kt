package Petclinic.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object Petclinic_Build : BuildType({
    uuid = "0201c7ba-460f-40ce-8a58-64a267424ce5"
    id = "Petclinic_Build"
    name = "Build"

    vcs {
        root(Petclinic.vcsRoots.Petclinic_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster)

    }

    steps {
        maven {
            goals = "clean test"
            mavenVersion = custom {
            }
        }
    }

    triggers {
        vcs {
        }
    }
})
