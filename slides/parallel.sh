#!/usr/bin/env bash
function sleepy_echo {
   sleep $(($RANDOM % 4))
   echo $1
}
export -f  sleepy_echo # export to subshell

parallel sleepy_echo ::: {1..20}