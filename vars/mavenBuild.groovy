def call()
{
  // Run Maven on a Unix agent.
  // sh "mvn -Dmaven.test.failure.ignore=true clean package"

  // To run Maven on a Windows agent, use
  bat "mvn -Dmaven.test.failure.ignore=true clean package"
}
  
