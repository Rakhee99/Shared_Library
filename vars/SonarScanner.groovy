def call ()
{
      def mvnHome=tool name : 'maven-R', type: 'maven'
      withSonarQubeEnv('SonarScanner'){
        bat "mvn sonar:sonar"}
}
  
