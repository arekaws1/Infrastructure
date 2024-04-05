pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/arekaws1/Frontend.git")
                    }
                    branches('final')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}
