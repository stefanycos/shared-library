#!groovy

package br.com.demo

def void execute() {
	stage {
		tool name: 'Maven-3.5.0', type: 'maven'
		sh "mvn -DskipTests -U clean package"	
	}
	
}
