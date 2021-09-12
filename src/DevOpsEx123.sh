#!/bin/bash

#Jr. DevOps Exercise
# Using the scripting language of your choice, write a script that does the following:

# Take a path to a text file as an argument (e.g. hello.sh path/to/file.txt)
# Add “Hello World” to a new line at the beginning of the file
# Add “Goodbye” to a new line at the end of the file

PATH=$PATH:/$1
sed -i -e '1iHello World\' $1
sed -i -e '$aGoodbye\' $1
