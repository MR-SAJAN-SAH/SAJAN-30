#!/bin/bash

echo "Enter the filename: "
read filename

# Check if the file exists
if [ ! -f "$filename" ]; then
    echo "File '$filename' does not exist."
    exit 1
fi

# Get the last column of every record in the file and sort them in ascending order
awk '{print $NF}' "$filename" | sort -g

