pipeline {
  agent any

  tools {
    // Nombre dado a la instalación de Maven en "Tools configuration"
    maven "maven default"
  }
  stages {
    stage('clone') { 
      steps {
        // Get some code from a GitHub repository
        git branch: 'main', credentialsId: 'guillessh', url: 'git@github.com:GuillermoMontalbanMartinez/Practica05Hmis.git'
      }
    }
    stage('clean package') { 
      steps {
        // When necessary, use '-f path-to/pom.xml' to give the path to pom.xml
        // Run goal 'package'. It includes compile, test and package.
        sh "mvn -f Practica05Hmis/pom.xml clean package" 
     }
    post { 
        // Record the test results and archive the jar file.
        success {
          junit '**/target/surefire-reports/TEST-*.xml'
          archiveArtifacts '**/target/*.jar'
          jacoco( 
              execPattern: '**/target/jacoco.exec',
              classPattern: '**/target/classes',
              sourcePattern: '**/src/',
              exclusionPattern: '**/test/'
             )
        publishCoverage adapters: [jacocoAdapter('**/target/site/jacoco/jacoco.xml')] 
    }
}

    }
  
  
   stage ('Analysis') {
      steps {
	    // Warnings next generation plugin required
	    sh "mvn -f  Practica05Hmis/pom.xml site"
      }
      post {
        success {
          

          dependencyCheckPublisher pattern: '**/target/site/dependency-check-report.xml'
          recordIssues enabledForFailure: true, tool: checkStyle()
          recordIssues enabledForFailure: true, tool: pmdParser()
          recordIssues enabledForFailure: true, tool: cpd()
          recordIssues enabledForFailure: true, tool: findBugs()
          recordIssues enabledForFailure: true, tool: spotBugs()
        }
      }
    }
    
    
    stage ('Documentation') {
      steps {
	    sh "mvn -f  Practica05Hmis/pom.xml javadoc:javadoc javadoc:aggregate" 
      }
      post{
        success {
          step $class: 'JavadocArchiver', javadocDir: 'Practica05Hmis/target/site/apidocs', keepAll: false 
          publishHTML(target: [reportName: 'Maven Site', reportDir: 'Practica05Hmis/target/site', reportFiles: 'index.html', keepAll: false]) 
        }
      }
    }
    
  
  }
  
  
  }