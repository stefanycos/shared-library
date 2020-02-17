package br.com.demo

class Checkout {

	private String _url
	private String _credentialId
	private String _branchName

	Checkout (Map params) {
		_url = params.url
		_credentialId = params.credentialId
		_branchName = params.branchName
	}

	void execute() {
		echo "URL: ${_url}"
		echo "Credential: ${_credentialId}"
		echo "Branch: ${_branchName}"
	}

}