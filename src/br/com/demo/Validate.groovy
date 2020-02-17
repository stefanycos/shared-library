#!groovy

package br.com.demo

def void execute () {
	response = httpRequest ( 
				consoleLogResponseBody: false,
				customHeaders: [['Content-Type': 'application/json']], 
				httpMode: 'GET', 
				ignoreSslErrors: true, 
				timeout: 120, 
				url: "http://localhost:8087/api/client/status",
				validResponseCodes: '200'
			)

	response_json = readJSON text: "${response.content}"
	echo "Application Status: ${response_json}" 
	
	if(response_json.contains('RUNNING')) {
		 currentBuild.result = 'SUCCESS'
    	 return
	}

	currentBuild.result = 'FAILURE'
    return
}