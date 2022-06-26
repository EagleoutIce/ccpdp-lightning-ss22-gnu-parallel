#!/bin/bash

javac Producer.java
javac Consumer.java



java Producer 100 | parallel -k java Consumer | xargs yarn --silent start