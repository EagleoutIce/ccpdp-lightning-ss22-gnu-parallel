### History:

https://www.gnu.org/software/parallel/history.html

GNU parallel was originally two tools: xxargs and parallel.

Cameron sums up the reason for developing xxargs very well in a posting from 2001-12-20:

    Having pretty much had it with xargs, which is a busted piece of crap due to its quoting/whitespace problems, here is a less featured but more robust one. - Cameron Simpson <cs@zip.com.au>

parallel dates back to around the same time. It was originally a wrapper that generated a makefile and used make -j to do the parallelization.

In 2005 it occurred to me that I often used xxargs and parallel together and I saw no reason why they could not merge into a single tool. The single tool was called parallel and the development of xxargs stopped. At this point both xxargs and parallel were used in production.

GNU parallel thus did not have one but two main objectives: replace xargs and run commands in parallel.

In 2010 parallel was adopted as an official GNU tool and the name was changed to GNU parallel. As GNU already had a tool for running jobs on remote computers (called pexec) it was a hard decision to include GNU parallel as well. I believe the decision was mostly based on GNU parallel having a more familiar user interface - behaving very much like xargs. Shortly after the release as GNU tool remote execution was added and all missing options from xargs were added to make it possible to use GNU parallel as a drop in replacement for xargs.

### Remote execution

https://www.gnu.org/software/parallel/parallel_tutorial.html#remote-execution

GNU parallel can run jobs on remote servers. It uses ssh to communicate with the remote machines.

Flag: -S $SERVER
parallel -S $SERVER1 echo running on ::: $SERVER1
parallel -S : echo running on ::: the_local_machine

GNU parallel can transfer the files to be processed to the remote host. It does that using rsync.

parallel -S $SERVER1 --transferfile {} --return {}.out --cleanup cat {} ">"{}.out ::: input_file
// Shorthand
parallel -S $SERVER1 --trc {}.out cat {} ">"{}.out ::: input_file

Add Basefile before the Job:
parallel --basefile common_file -S $SERVER1 cat common_file\; echo {} ::: foo

--workdir
--onall
--nonall non argument onall
--tag for output

Prevent sshd Overloading:
parallel -S $SERVER1 --sshdelay 0.2 echo ::: 1 2 3
Multiplex ssh connections:
--controlmaster
