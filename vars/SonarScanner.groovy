def call ()
{
      withSonarQubeEnv('SonarScanner'){
        bat "mvn sonar:sonar"}
}
  
