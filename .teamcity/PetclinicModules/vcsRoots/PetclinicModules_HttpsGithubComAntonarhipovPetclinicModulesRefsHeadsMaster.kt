package PetclinicModules.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster : GitVcsRoot({
    uuid = "0a2f320a-9d45-4ed7-a24c-ac87d9582d72"
    id = "PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster"
    name = "https://github.com/antonarhipov/petclinic-modules#refs/heads/master"
    url = "https://github.com/antonarhipov/petclinic-modules"
    branchSpec = "+:refs/heads/requirementInBranch"
    authMethod = password {
        userName = "antonarhipov"
        password = "credentialsJSON:0de62264-2d38-42fe-bea4-e13b8b35089b"
    }
})
