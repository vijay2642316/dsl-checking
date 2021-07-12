job('example-1') {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    scm {
        git {
            remote {
                name('remoteB')
                url('git@server:account/repo1.git')
            }
            extensions {
                cleanAfterCheckout()
                relativeTargetDirectory('repo1')
            }
        }
    }
  steps {
        shell "Look: I'm building master!"
    }
}
