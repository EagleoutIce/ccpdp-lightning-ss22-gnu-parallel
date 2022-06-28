#!/usr/bin/env bash
function sleepy_echo {
   sleep $(($RANDOM % 4))
   echo $1
}
export -f  sleepy_echo # export to subshell

time cat parallel.in | parallel sleepy_echo
# time cat parallel.in | xargs -I{} bash -c 'sleepy_echo {}'

#ps -F e