import br.com.demo.Checkout

def call(Map params) {
    
    def checkout = new Checkout(params)
    checkout.execute()
    
}