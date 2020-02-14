import br.com.demo.Checkout

def call(String url, String credentialId, String branchName) {
    
    def checkout = new Checkout(url, credentialId, branchName)
    checkout.execute()
    
}