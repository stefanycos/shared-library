import br.com.demo.HelloWorld

def call(String solutionPath) {

    def helloworld = new HelloWorld(solutionPath)
    helloworld.build()
}