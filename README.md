# kafka-spring

## Summary

This project shows how to setup a Kafka producer/consumer.  You can use a REST API to send
in an event.  And use a REST API to see events consumed.

### Usage
> mvn clean install \
> mvn test \
> java -jar target/kafka-spring-producer-consumer-1.0-SNAPSHOT.jar


### To test producing an event
http://localhost:9800/produce?sequenceId=2&learnerId=f8c3de3d-1fea-4d7c-a8b0-29f63c4c3454