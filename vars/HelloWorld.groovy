import br.com.demo.HelloWorld

def call(Map params) {

    def helloworld = new HelloWorld(params.solutionPath)
    helloworld.build()
}