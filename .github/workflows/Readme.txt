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
cp ~/.kube/eksctl/clusters/EKS-Cluster-Grupo1-UTEC ~/.kube/config (no aplica para nuestro caso)
Informacion de nuestro nodo
 Addresses:
  InternalIP:   10.0.18.242
  ExternalIP:   44.204.195.223
  InternalDNS:  ip-10-0-18-242.ec2.internal
  Hostname:     ip-10-0-18-242.ec2.internal
  ExternalDNS:  ec2-44-204-195-223.compute-1.amazonaws.com
Capacity:
ponemos la SG de la EC2 del Cluster
Creamos un ssh credential adicional al mismo Usuario
AWS_ACCESS_KEY_ID= AKIAZHKADEG3WJXE65D7
AWS_SECRET_ACCESS_KEY= 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
user:    gpo1-utec-adc
clave:   Gr4p01Ut3c
export KUBECONFIG=$KUBECONFIG:~/.kube/config
EKS-Node-Grupo1-Utec
nodeconci
clusconci
arn:aws:iam::634178970039:role/eks-rol-grupo1-utec


current-context: EKS-Cluster-Grupo1-UTEC

 ssh -i "id_rsa" root@i-08e71ea76d80edd9a.compute-1.amazonaws.com

 kubectl edit -n kube-system configmap/aws-auth

   mapUsers: |
    - groups:
          - system:masters
      userarn: arn:aws:iam::634178970039:user/user-grupo1-utec
      username: user-grupo1-utec

      RUN yum install -y java-1.8.0-openjdk
      CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -java ConciliacionApplication.java




