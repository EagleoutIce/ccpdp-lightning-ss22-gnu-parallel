#!/bin/bash

yarn install

cd java-side && mvn package && cd ..
cp java-side/target/consumer.jar ./
cp java-side/target/producer.jar ./
cp java-side/target/accountant.jar ./


java -jar producer.jar 100000 | parallel --pipe java -jar consumer.jar | yarn --silent start
#java -jar producer.jar 100000 | parallel --pipe java -jar consumer.jar | java -jar accountant.jar