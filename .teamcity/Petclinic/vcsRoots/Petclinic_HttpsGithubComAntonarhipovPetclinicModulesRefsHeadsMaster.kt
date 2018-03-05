package Petclinic.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object Petclinic_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster : GitVcsRoot({
    uuid = "ee85384d-e7e2-4dc0-abea-748451dbc1ff"
    id = "Petclinic_HttpsGithubComAntonarhipovPetclinicModulesRefsHeadsMaster"
    name = "https://github.com/antonarhipov/petclinic-modules#refs/heads/master"
    url = "https://github.com/antonarhipov/petclinic-modules"
    branchSpec = "+:refs/heads/*"
    authMethod = password {
        userName = "antonarhipov"
        password = "credentialsJSON:d45a85e1-08b9-4666-92c2-e3c4f43d8ca9"
    }
})
