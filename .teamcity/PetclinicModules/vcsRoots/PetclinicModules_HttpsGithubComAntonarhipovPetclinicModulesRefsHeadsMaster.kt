package PetclinicModules.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster : GitVcsRoot({
    uuid = "6a1fa6b5-3177-4a3d-b3f9-2fbd771e8f54"
    id = "PetclinicModules_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster"
    name = "https://github.com/antonarhipov/petclinic-modules#refs/heads/master"
    url = "https://github.com/antonarhipov/petclinic-modules"
    authMethod = password {
        userName = "antonarhipov"
        password = "credentialsJSON:8c4a0202-224f-4078-a13a-42320dfaa4bb"
    }
})
