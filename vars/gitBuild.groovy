#!groovy

import br.com.demo.Build

def call(Map params) {
	
	def build = new Build()
	build.execute()
	
}