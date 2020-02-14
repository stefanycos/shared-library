package br.com.demo
class Checkout {

	private String _url
	private String _credentialId
	private String _branchName

	Checkout (String url, String credentialId, String branchName) {
		_url = url
		_credentialId = credentialId
		_branchName = branchName
	}

	void execute() {
		echo "URL: ${_url}"
		echo "Credential: ${_credentialId}"
		echo "Branch: ${_branchName}"
	}

}