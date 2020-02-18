#!groovy

package br.com.demo

def String getUserGroup() {
	
        response = httpRequest ( 
            consoleLogResponseBody: false,
            customHeaders: [[maskValue: true, name: 'Private-Token', value: "${jkgt}"]],    
            httpMode: 'GET', 
            ignoreSslErrors: true, 
            timeout: 3, 
            url: "http://gitlab.tokiomarine.com.br/api/v4/groups/smud/members",
            validResponseCodes: '200',
            quiet: true
        )
    
        
    response_content = readJSON text: "${response.content}"
    return response_content.username.join(",")
}