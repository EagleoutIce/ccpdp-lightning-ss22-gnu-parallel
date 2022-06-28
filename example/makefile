.PHONY: run

SHELL   := /bin/bash
SOURCES := $(shell find . -name '*.java')

run: consumer.jar
	java -jar producer.jar 1000000 | parallel --pipe java -jar consumer.jar | java -jar accountant.jar

# TODO: -X and -m option https://www.gnu.org/software/parallel/parallel_tutorial.html

run-no-parallel: consumer.jar
	java -jar producer.jar 1000000 | java -jar consumer.jar | java -jar accountant.jar

consumer.jar: $(SOURCES)
	cd java-side && mvn clean compile package && cd ..
	cp java-side/target/consumer.jar ./
	cp java-side/target/producer.jar ./
	cp java-side/target/accountant.jar ./