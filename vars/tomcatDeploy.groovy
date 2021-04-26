def call()
{
  deploy adapters: [tomcat9(credentialsId: 'c086106e-65d8-4a23-b377-292a59e0b30f', 
                            path: '', 
                            url: 'http://localhost:8083/')], 
                            contextPath: null, 
                            war: 'target/*.war'
}
