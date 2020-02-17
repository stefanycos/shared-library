#!groovy

package br.com.demo

def void execute() {
	script {
        shortCommit = sh (
            script:  "mvn -DskipTests -U clean package",
            returnStdout: true
        ).trim()
        return shortCommit
    }
}
