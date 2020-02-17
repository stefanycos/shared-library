#!groovy

package br.com.demo

def execute () {
	tool name: 'Maven-3.6.1', type: 'maven'
    bat "mvn spring-boot:run"
}