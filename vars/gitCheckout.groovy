#!groovy

def call(Map params) {

	def git = new br.com.demo.Git()
	git.checkout(params.branch, params.url)
	
}