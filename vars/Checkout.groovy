import br.com.demo.Checkout

def call(Map params) {
    echo "Pametros: $params"

    def checkout = new Checkout(params.url, params.credentialId, params.branchName)
    checkout.execute()
    
}