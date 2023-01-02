## Requirements
- Java 19
- Maven
- (Optional) Docker

## Run
Open a terminal in the project folder and run:

`mvn package`

`java -cp ./target/crosskey_codetest-1.0-SNAPSHOT.jar org.example.Main`

## Run with docker
`mvn package`

`docker build . -t mortgage`

`docker run mortgage`