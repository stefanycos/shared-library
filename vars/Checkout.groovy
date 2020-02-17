#!groovy

def call(body) {

	def git = new br.com.demo.Git()
	git.checkout(body.branch, body.url)
	
}