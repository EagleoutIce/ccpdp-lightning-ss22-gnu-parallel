#!/bin/bash

# yarn install

cd java-side && mvn package && cd ..
cp java-side/target/consumer.jar ./
cp java-side/target/producer.jar ./


java -jar producer.jar 100 | parallel -k java -jar consumer.jar | xargs yarn --silent start