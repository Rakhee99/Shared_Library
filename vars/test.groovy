def call()
{
      junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.war'
}
