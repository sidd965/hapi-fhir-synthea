tools:
	sudo apt-get update -y
	sudo apt-get install docker.io -y
	sudo curl -L https://github.com/docker/compose/releases/download/1.21.2/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose
	sudo chmod +x /usr/local/bin/docker-compose
	sudo usermod -aG docker $USER
	sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose
	sudo service docker restart
	sudo chmod 666 /var/run/docker.sock
build:
	docker-compose build --no-cace
 
start:
	docker-compose up -d
 
stop:
	docker-compose down
synthea:
	curl -Ns "http://localhost:8000/?stu=3&p=10"
