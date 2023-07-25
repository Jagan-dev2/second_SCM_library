import com.jagandev.builds.Calculator
def call(Map pipelineParams){
    library('com.jagandev.slb')
    Calculator calculator = new Calculator(this)
    pipeline{
    agent any
    environment {
        APP_NAME = "${PipelineParams.appName}"
    }
    stages{
        stage('echo')
        {
            steps{
                script{
                    echo "Implementing library"
                    println calculator.add(3,4)
                    echo "MIcroservice name is ${APP_NAME}"
                    
                }
            }
        }
    }
}
}