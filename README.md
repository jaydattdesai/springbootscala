# Spring boot Scala
Project with CRUD operations with spring boot using scala.

## Running the project
./gradlew bootRun --> and it will start the application on http://localhost:8080
## Creating Person object
Use

HTTP method: POST

endpoint: http: http://localhost:8080/persons

body: {"firstName":"Jaydatt"}

in your favourite client. e.g. postman or use below command from terminal

sample curl command: curl  --header "Content-Type: application/json" --request POST  --data '{"firstName":"Jaydatt"}' http://localhost:8080/persons

in response it will give you and id for further communication for that object.

## Fetching Person object

HTTP method: GET

endpoint: http: http://localhost:8080/persons/{id}

sample curl command:  curl http://localhost:8080/persons/1

## Deleting Person object

HTTP method: DELETE

endpoint: http: http://localhost:8080/persons/{id}

sample curl command:  curl --request DELETE http://localhost:8080/persons/1
