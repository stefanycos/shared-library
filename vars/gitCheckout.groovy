#!groovy

import br.com.demo.Checkout

def call() {
	
	def checkout = new Checkout()
	checkout.execute(params.branch, params.url)
	
}