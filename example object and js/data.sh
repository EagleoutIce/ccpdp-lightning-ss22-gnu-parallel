#!/usr/bin/env zsh
# only zsh can use the ';' trick... bash can't i think
make run& ; sleep 0.5; ps -o pid,ppid,cpuid,cmd > run.data