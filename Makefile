install:
	./mvnw clean install

# Создать postgres базу данных в docker
database:
	docker run --name postgres-docker -e POSTGRES_PASSWORD=example -p 5432:5432 -v postgres-data:/var/lib/postgresql/data -d postgres
# Запустить обновление базы данных
update:
	./mvnw liquibase:update
# Удалить докер контейнеры
drop:
	docker rm -f $$(docker ps -qa); docker volume rm $$(docker volume ls -q);
