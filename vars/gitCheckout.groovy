#!groovy

import br.com.demo.Checkout

def call(Map params) {

	def checkout = new Checkout()
	checkout.execute(params.branch, params.url)
	
}