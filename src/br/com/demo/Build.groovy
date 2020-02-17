#!groovy

package br.com.demo

def void execute() {
	sh "mvn -DskipTests -U clean package"
}
