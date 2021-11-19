build:
	docker-compose build --no-cace
 
start:
	docker-compose up -d
 
down:
	docker-compose down
synthea:
	curl -Ns "http://localhost:8000/?stu=3&p=10"
