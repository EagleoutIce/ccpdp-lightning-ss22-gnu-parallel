#!/bin/bash

javac Producer.java
javac Consumer.java



java Producer | parallel -k java Consumer