.PHONY: run

SHELL   := /bin/bash
SOURCES := $(shell find . -name '*.java')

run: consumer.jar node_modules
	java -jar producer.jar 1000000 | parallel --pipe --roundrobin -j4 java -jar consumer.jar | yarn --silent start-consumer

consumer.jar: $(SOURCES)
	cd java-side && mvn clean compile package && cd ..
	cp java-side/target/consumer.jar ./
	cp java-side/target/producer.jar ./
	cp java-side/target/accountant.jar ./

node_modules: package.json
	yarn install