#!/bin/bash

echo "Enter the directory path:"
read directory

# Check if the directory exists
if [ ! -d "$directory" ]; then
    echo "Directory '$directory' does not exist."
    exit 1
fi

echo "Executable files in directory '$directory':"

# Use find command to locate executable files and count them
executable_files=$(find "$directory" -maxdepth 1 -type f -executable)
file_count=$(find "$directory" -maxdepth 1 -type f -executable | wc -l)

# Display the names and count of executable files
echo "$executable_files"
echo "Total count: $file_count"

