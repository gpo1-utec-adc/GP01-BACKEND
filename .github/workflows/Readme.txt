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
      userarn: arn:aws:iam::243616138453:user/user-grupo1-utec
      username: user-grupo1-utec

      RUN yum install -y java-1.8.0-openjdk
      CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -javac ConciliacionApplication.java


Nombre de la política 
Tipo
Adjuntado a través de 
AdministratorAccess	Administrada por AWS: función de trabajo	Directamente, Grupo Administrador
AmazonConnect_FullAccess	Administrada por AWS	Directamente
AmazonEC2ContainerRegistryReadOnly	Administrada por AWS	Directamente
AmazonEC2FullAccess	Administrada por AWS	Directamente
AmazonEKS_CNI_Policy	Administrada por AWS	Directamente
AmazonEKSClusterPolicy	Administrada por AWS	Directamente
AmazonEKSWorkerNodePolicy	Administrada por AWS	Directamente
AWSCodeBuildAdminAccess	Administrada por AWS	Directamente
AWSCompromisedKeyQuarantineV2	Administrada por AWS	Directamente
create_rol	Cliente insertado	Inline
full_EC2	Cliente insertado	Inline
rol-githubaction-policy-grupo1

====================================================================================================
    1  df -h
    2  npm -v
    3  npm i
    4  npm install
    5  clear
    6  sudo apt update
    7  sudo apt upgrade
    8  sudo apt install -y git htop
    9  ng serve
   10  sudo apt install -y ng-common 
   11  ng -v
   12  ng serve
   13  pwd
   14  ls
   15  cd master/
   16  ls
   17  cd PROYECTO-UTEC-GP01/
   18  cd GP01-FRONTEND/
   19  ll
   20  npm install
   21  npm install -g @angular/cli@latest
   22  npm install
   23  npm --version
   24  npm start
   25  more /home/ubuntu/.npm/_logs/2023-10-15T03_45_24_286Z-eresolve-report.txt
   26  cd master/PROYECTO-UTEC-GP01/GP01-FRONTEND/
   27  ls
   28  npm install --legacy-peer-deps
   29  npm audit fix --legacy-peer-deps
   30  npm start
   31  wget -version
   32  wget --version
   33  telnet localhost 4200
   34  wget http://52.201.142.155:4200/conciliacion
   35  ifconfig
   36  sudo ifconfig
   37  hostname
   38  netstat -n
   39  sudo apt install net-tools
   40  netstat -n
   41  netstat -n |gre -i STABLI
   42  netstat -n |gre -i ESTABLISHED
   43  netstat -n |grep -i ESTABLISHED
   44  route
   45  cd master/PROYECTO-UTEC-GP01/GP01-FRONTEND/
   46  ls
   47  npm start
   48  ps -ef |grep conci
   49  ps -ef
   50  ps -ef |grep npm
   51  kill -9 25505
   52  ps -ef |grep npm
   53  npm start
   54  telnet localhost 4200
   55  npm statu
   56  npm status
   57  npm help
   58  npm stop
   59  npm restart
   60  cd master/PROYECTO-UTEC-GP01/GP01-FRONTEND/
   61  npm start
   62  telnet localhost 4200
   63  ps -ef |grep npm
   64  netstat -n |grep -i ESTABLISHED
   65  netstat -n
   66  netstat -t
   67  netstat -p
   68  netstat -na
   69  netstat -n |gre -i ESTABLISHED
   70  netstat -n |grep -i ESTABLISHED
   71  netstat -n |grep -i LISTEN
   72  netstat -na |grep -i LISTEN
   73  netstat -na |grep -i LISTEN | grep 4200
   74  cd master/PROYECTO-UTEC-GP01/GP01-FRONTEND/
   75  npm stop
   76  npm run
   77  ng serve 
   78  npm stoped
   79  npm stop
   80  ps -ef |grep npm
   81  kill -9 971
   82  ps -ef |grep npm
   83  ps -ef |grep con
   84  ps -ef |grep GP
   85  sudo ufw allow 4200/tcp
   86  restart iptables
   87  sudo ufw deny 4200/tcp
   88  sudo ufw allow 4200/tcp
   89  sudo ufw status
   90  telnet localhost 4200
   91  sudo init 6
   92  sudo /etc/init.d/nginx stop
   93  cd /master/PROYECTO-UTEC-GP01/GP01-FRONTEND
   94  cd master/PROYECTO-UTEC-GP01/GP01-FRONTEND
   95  ng serve --port 80
   96  ng serve --port 3000
   97  df -h
   98  netstat -na
   99  netstat -na |grep 'LISTEN '
  100  cd master/PROYECTO-UTEC-GP01/GP01-FRONTEND
  101  ps -ef |grep 'ng serve'
  102  kill -9 5280 5281
  103  ps -ef |grep 'ng serve'
  104  ng serve --host 0.0.0.0
  105  ps -ef |grep 'ng serve'
  106  cd master/PROYECTO-UTEC-GP01/GP01-FRONTEND
  107  netstat -na |grep -i "LISTEN "
  108  pm2 status
  109  pm2 start
  110  netstat -na |grep -i "LISTEN "
  111  pm2 startup
  112  netstat -na |grep -i "LISTEN "
  113  sudo env PATH=$PATH:/home/ubuntu/.nvm/versions/node/v18.18.2/bin /home/ubuntu/.nvm/versions/node/v18.18.2/lib/node_modules/pm2/bin/pm2 startup systemd -u ubuntu --hp /home/ubuntu
  114  netstat -na |grep -i "LISTEN "
  115  ps -ef |grep pm2
  116  git pull
  117  pm2 restart
  118  pm2 reload
  119  pm2 resurrect
  120  netstat -na |grep -i "LISTEN "
  121  pm2 status
  122  pm2 stop
  123  pm2 unstartup
  124  pm2 startup systemd
  125  sudo env PATH=$PATH:/home/ubuntu/.nvm/versions/node/v18.18.2/bin /home/ubuntu/.nvm/versions/node/v18.18.2/lib/node_modules/pm2/bin/pm2 startup systemd -u ubuntu --hp /home/ubuntu
  126  pm2 ls
  127  ng serve
  128  ls
  129  npm install --legacy-peer-deps
  130  npm install --save --legacy-peer-deps
  131  npm config set legacy-peer-deps true
  132  npm cache clean --force
  133  npm install
  134  ng serve
  135  netstat -na |grep -i "LISTEN "
  136  git pull
  137  df -h
  138  ps -ef |grep ng
  139  ps -ef |grep pm2
  140  ps -ef |grep concilia
  141  netstat -na |grep 'LISTEN '
  142  pm2 ls
  143  ls
  144  exit
  145  ping 10.0.18.242
  146  ping 44.204.195.223
  147  ping ip-10-0-18-242.ec2.internal
  148  ping ec2-44-204-195-223.compute-1.amazonaws.com
  149  ping 10.4.34.120
  150  ping 169.254.172.1
  151  ifconfig
  152  exit
  153  pwd
  154  cd ~/.kube
  155  cd /ù
  156  cd /
  157  s
  158  ll
  159  ping ec2-34-203-206-195.compute-1.amazonaws.com
  160  ssh ec2-34-203-206-195.compute-1.amazonaws.com
  161  ssh runner@ec2-34-203-206-195.compute-1.amazonaws.com
  162  pwd
  163  cd
  164  ll
  165  cd .ssh
  166  ll
  167  ssh -i "id_rsa" root@ec2-34-203-206-195.compute-1.amazonaws.com
  168  ping 634178970039.dkr.ecr.us-east-1.amazonaws.com
  169  cat id_rsa
  170  pwd
  171  ll
  172  hostname
  173  ping 172.20.186.249
  174  telnet 172.20.186.249 80
  175  df -h
  176  history
====================================
   - name: Set up JDK 8
      uses: actions/setup-java@v2
      with:
          java-version: '8'
          distribution: 'adopt'
   
      - name: Build with Maven
        run:  mvn -B package --file pom.xml

java:openjdk-8-jdk-alpine

URL de la BD dbprd01.ctpsywmohtj4.us-east-2.rds.amazonaws.com:5432