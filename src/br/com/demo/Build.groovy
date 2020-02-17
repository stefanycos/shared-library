#!groovy

package br.com.demo

def void execute() {
	echo 'Starting BUILD Test'
	tool name: 'Maven-3.6.1', type: 'maven'
    bat "mvn -DskipTests -U clean package"
}
