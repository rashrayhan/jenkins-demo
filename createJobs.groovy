pipelineJob('dogBackendJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rashrayhan/dog-backend.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}