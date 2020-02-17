#!groovy

package br.com.demo

def void execute() {
	tool name: 'Maven-3.6.1', type: 'maven'
    bat "mvn -DskipTests -U clean package"
}
