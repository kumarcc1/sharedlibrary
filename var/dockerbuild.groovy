def call(String project) {
        
  sh 'docker build . -t kumarcc1/devops-training:$Docker_tag'
		   withCredentials([string(credentialsId: 'dockerhub', variable: 'docker_password')]) {
				    
				  sh 'docker login -u kumarcc1 -p $docker_password'
				  sh 'docker push kumarcc1/devops-training:$Docker_tag'
			}
}
