package PetclinicModules.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object PetclinicModules_Build : BuildType({
    uuid = "9131f8c0-3464-41d8-b4d9-0ef16fcb14c2"
    id = "PetclinicModules_Build"
    name = "Build"

    vcs {
        root(PetclinicModules.vcsRoots.PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster)

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

    requirements {
        exists("env.AGENT_NAME", "RQ_3")
    }
    
    disableSettings("RQ_3")
})
