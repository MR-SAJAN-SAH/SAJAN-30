#!/bin/bash

echo "Enter the filename: "
read filename

# Check if the file exists
if [ ! -f "$filename" ]; then
    echo "File '$filename' does not exist."
    exit 1
fi

echo "Enter the string to search: "
read search_string

# Perform the search and count occurrences
occurrences=$(grep -o -c "$search_string" "$filename")

echo "The string '$search_string' occurred $occurrences times in '$filename'."

