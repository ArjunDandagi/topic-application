# SpringBoot with JPA MYSQL

sample spring boot app to understand directory structer 
and creating an app with mysql as the database backend


## Initial Setup
run a mysql server on your host ( use a container otherwise)
```bash
mysql> create database topics; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on topics.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created 
```

now you are all set to run this application
## USAGE
```
git clone https://github.com/ArjunDandagi/topic-application
cd topic-application
mvn clean install # you can just download dependency also using mvn dependency:resolve
mvn spring-boot:run

```

now go to `http://localhost:8080/hello` to make sure app is good

#CRUD

## CREATE
> curl -H "Content-type: Application/json" -X POST http://localhost:8080/topics -d '{"id":"java","name":"java","description":"java is awesome"}'
>

## GET
> curl -H "Content-type: Application/json" -X GET http://localhost:8080/topics

## GET BY ID

> curl -H "Content-type: Application/json" -X GET http://localhost:8080/topics/java
>
if you ask for a topic whose id doesn't exist . it will throw an error :smile:


## Update A Topic 

> curl -H "Content-type: Application/json" -X PUT http://localhost:8080/topics/java -d '{"id":"java","name":"java","description":"java and maven is awesome"}'

## Delete A Topic
> curl -H "Content-type: Application/json" -X DELETE http://localhost:8080/topics/java