#!groovy

import br.com.demo.Build

def call() {
	
	def build = new Build()
	build.execute()
	
}