package br.com.demo


class HelloWorld implements Serializable {
    private String _solutionPath

    HelloWorld(String solutionPath) {
        _solutionPath = solutionPath
    }

    void build() {
        echo "Building.... $_solutionPath"
    }
}
