#!groovy

package br.com.demo

def void execute(branch, url, credentials) {
	
	checkout([
        $class: 'GitSCM',
        branches: [[name:  branch ]],
        userRemoteConfigs: [[ url: url ]]
    ])
}
