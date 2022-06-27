.PHONY: run

SHELL   := /bin/bash
SOURCES := $(shell find . -name '*.java')

run: consumer.jar
	java -jar producer.jar 100000 | parallel --pipe java -jar consumer.jar | java -jar accountant.jar

consumer.jar: $(SOURCES)
	cd java-side && mvn clean compile package && cd ..
	cp java-side/target/consumer.jar ./
	cp java-side/target/producer.jar ./
	cp java-side/target/accountant.jar ./