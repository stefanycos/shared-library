#!groovy

import br.com.demo.Validate

def call(Map params) {

	def validate = new Validate()
	validate.execute()
	
}