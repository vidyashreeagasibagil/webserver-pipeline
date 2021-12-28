node{
    stage("GIT"){
        println "git running"
    }
    stage("BUILD"){
        println "build running"
    }
    stage("Deploy"){
        println "deploying proj"
    }
}
