#!groovy
echo "==================== Generic Information about the Application [START] ==============================================="
// GIT Repository
def gitURL 		= '${GIT_Repo}'
def git_Branch 	= "${GIT_Branch}"
def tarName  = '${TAR_Name}'
println git_Branch
echo  "			Application GIT Repo: ${GIT_Repo}"
echo  "			Application Branch Name: ${GIT_Branch}"

pipeline{
 agent any
    stages { 
       stage('Code Checkout') {	
			steps{
			script {
                    def x = ['a', 'b', 'c']
                    println x 
                    for(String item: x) {
                        println item
                    }
			}
            }
		stage ('Build and Publish'){
			steps{
            
			    unstash 'workspace' 
                sh "tar -cvf ${tarName}.tar.gz * --exclude=Jenkins_OFA"
                
                          }
    }
    }
}         

}
