#!/bin/bash

echo "Enter the filename: "
read filename

# Check if the file exists
if [ ! -f "$filename" ]; then
    echo "File '$filename' does not exist."
    exit 1
fi

echo "Enter the output filename: "
read output_filename

# Count total lines in the file
total_lines=$(wc -l < "$filename")

# Calculate start and end lines for cutting the middle 5 lines
start_line=$((total_lines / 2 - 2)) # Start 2 lines before the middle
end_line=$((start_line + 5))        # End 5 lines after the start line

# Cut the middle 5 lines and redirect to the output file
sed -n "${start_line},${end_line}p" "$filename" > "$output_filename"

echo "Middle 5 lines cut from '$filename' and written to '$output_filename'."

