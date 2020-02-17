#!groovy

package br.com.demo

def void execute() {
	echo 'Starting BUILD'
	script {
        mvnPackage = bat (
            script:  "mvn -DskipTests -U clean package",
            returnStdout: true
        ).trim()
        return mvnPackage
    }
}
