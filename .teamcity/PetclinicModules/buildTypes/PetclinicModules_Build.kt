package PetclinicModules.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object PetclinicModules_Build : BuildType({
    uuid = "53d302ca-3298-47c8-9900-367943c102d0"
    id = "PetclinicModules_Build"
    name = "Build"

    artifactRules = "petclinic-webapp/target/petclinic.war"

    vcs {
        root(PetclinicModules.vcsRoots.PetclinicModules_PetclinicModulesWithBranches)
    }

    steps {
        maven {
            goals = "clean package"
            mavenVersion = defaultProvidedVersion()
        }
    }

    triggers {
        vcs {
        }
    }

    requirements {
        equals("system.ec2.ami-id", "ami-123123", "RQ_1")
    }
    
    disableSettings("RQ_1")
})
