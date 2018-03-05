package PetclinicModules.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object PetclinicModules_PetclinicModulesWithBranches : GitVcsRoot({
    uuid = "efdeab34-bd5d-4b78-8a33-564cb60b5370"
    id = "PetclinicModules_PetclinicModulesWithBranches"
    name = "Petclinic Modules with branches"
    url = "https://github.com/antonarhipov/petclinic-modules"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "antonarhipov"
        password = "credentialsJSON:d9801888-f50b-4e9b-9132-1aafd4f3191b"
    }
})
