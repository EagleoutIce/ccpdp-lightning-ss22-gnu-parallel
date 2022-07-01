#!/usr/bin/env zsh
# only zsh can use the ';' trick... bash can't i think
make run& ; sleep 6; ps -o pid,ppid,cpuid,cmd > run.data