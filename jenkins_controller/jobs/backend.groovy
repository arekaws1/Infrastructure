pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/arekaws1/Backend.git")
                    }
                    branches('final')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
