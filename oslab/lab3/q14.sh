#!/bin/bash

echo "Enter the filename: "
read filename

# Check if the file exists
if [ ! -f "$filename" ]; then
    echo "File '$filename' does not exist."
    exit 1
fi

echo "Enter the string to cut: "
read cut_string

echo "Enter the output filename: "
read output_filename

grep "$cut_string" "$filename" > "$output_filename"

echo "String '$cut_string' cut from '$filename' and written to '$output_filename'."

