#!groovy

package br.com.demo

def void checkout(branch, url) {

   checkout([
        $class: 'GitSCM',
        branches: [[name:  branch ]],
        userRemoteConfigs: [[ url: url ]]
    ])

}


def void build() {
	
	sh "mvn -DskipTests -U clean package"

}


return this