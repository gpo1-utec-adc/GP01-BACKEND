Variables
AWS_ACCESS_KEY_ID esto es confidencial
AWS_DEFAULT_REGION us-east-1
AWS_SECRET_ACCESS_KEY esto es confidencial
AWS_SG_NAME launch-wizard-1
HOST_IP 52.201.142.155
SSH_KEY 
Agregamos el Rol AWSCodeBuildAdminAccess Al Usuario user-grupo1-utec
Agregamos Regla de salida port 8080 en el Cluster
install netstat en cluester eks
sudo yum install net-tools
install telnet en cluester eks
sudo yum install telnet
Para solucionar este mensaje "The connection to the server localhost:8080 was refused - did you specify the right host or port?
	 " en el eks aplicar el sgte comando
cp ~/.kube/eksctl/clusters/EKS-Cluster-Grupo1-UTEC ~/.kube/config


    - name: Update kube config
      run: aws eks update-kubeconfig --name EKS-Cluster-Grupo1-UTEC --alias EKS-Cluster-Grupo1-UTEC
    