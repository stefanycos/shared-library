#!groovy

package br.com.demo

def void execute () {
	response = httpRequest ( 
				contentType: 'APPLICATION_JSON',
				consoleLogResponseBody: false,
				httpMode: 'GET', 
				ignoreSslErrors: true, 
				timeout: 120, 
				url: "http://localhost:8087/api/client/status",
				validResponseCodes: '200'
			)

	response_json = readJSON text: "${response.content}"
	echo "Application Status: ${response_json}" 
	
	if(response_json.contains('running')) {
		 currentBuild.result = 'SUCCESS'
    	 return
	}

	currentBuild.result = 'FAILURE'
    return
}