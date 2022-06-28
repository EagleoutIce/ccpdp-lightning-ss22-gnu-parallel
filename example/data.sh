#!/usr/bin/env zsh
# only zsh can use the ';' trick... bash can't i think
make run-no-parallel& ; sleep 1; ps -o pid,ppid,cpuid,cmd > run.data
make run& ; sleep 1; ps -o pid,ppid,cpuid,cmd > run2.data