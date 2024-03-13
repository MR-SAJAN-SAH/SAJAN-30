#!/bin/bash

echo "Enter the directory path:"
read directory

# Check if the directory exists
if [ ! -d "$directory" ]; then
    echo "Directory '$directory' does not exist."
    exit 1
fi

echo "Removing empty files from directory '$directory':"

# Use find command to locate empty files and remove them
find "$directory" -type f -empty -delete

echo "Empty files removed."

