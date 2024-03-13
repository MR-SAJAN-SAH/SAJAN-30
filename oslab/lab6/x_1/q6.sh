#!/bin/bash

# Check if three filenames are provided as command-line arguments
if [ "$#" -ne 3 ]; then
    echo "Usage: $0 <file1> <file2> <output_file>"
    exit 1
fi

# Extract filenames from command-line arguments
file1="$1"
file2="$2"
output_file="$3"

# Check if the first file exists
if [ ! -f "$file1" ]; then
    echo "File '$file1' does not exist."
    exit 1
fi

# Check if the second file exists
if [ ! -f "$file2" ]; then
    echo "File '$file2' does not exist."
    exit 1
fi

# Concatenate the contents of the first two files line by line and store the result in the third file
paste -d '\n' "$file1" "$file2" > "$output_file"

echo "Concatenated contents of '$file1' and '$file2' stored in '$output_file'."

