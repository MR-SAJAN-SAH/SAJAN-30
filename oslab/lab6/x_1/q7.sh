#!/bin/bash

# Set the maximum size of each directory in bytes
MAX_SIZE=$((1024*1024*1024))  # 1 GB

# Initialize counter for directory names
dir_counter=1

# Initialize size accumulator for current directory
dir_size=0

# Create the first directory
mkdir -p x_"$dir_counter"

# Move files to directories based on size
for file in *; do
    # Check if the file is a regular file
    if [ -f "$file" ]; then
        # Get the size of the file in bytes
        file_size=$(stat -c "%s" "$file")
        
        # Check if adding the file would exceed the maximum size
        if [ $((dir_size + file_size)) -gt $MAX_SIZE ]; then
            # Create a new directory
            dir_counter=$((dir_counter + 1))
            mkdir -p x_"$dir_counter"
            dir_size=0
        fi
        
        # Move the file to the current directory
        mv "$file" x_"$dir_counter"/
        
        # Update the size accumulator for the current directory
        dir_size=$((dir_size + file_size))
    fi
done

