#!groovy

package br.com.demo

def void execute() {
	script {
        mvnPackage = bat (
            script:  "mvn -DskipTests -U clean package",
            returnStdout: true
        ).trim()
        return mvnPackage
    }
}
