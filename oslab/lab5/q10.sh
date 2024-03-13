#!/bin/bash

# Define directory paths
source_directory="$HOME/XYZ"
target_file_directory="$source_directory/MyFile"
target_dir_directory="$source_directory/MyDir"

# Check if the source directory exists
if [ ! -d "$source_directory" ]; then
    echo "Source directory '$source_directory' does not exist."
    exit 1
fi

# Check if the target directories exist; if not, create them
if [ ! -d "$target_file_directory" ]; then
    mkdir "$target_file_directory"
fi

if [ ! -d "$target_dir_directory" ]; then
    mkdir "$target_dir_directory"
fi

# Move files from source directory to target file directory
echo "Moving files from '$source_directory' to '$target_file_directory'"
mv "$source_directory"/* "$target_file_directory"/

# Move directories from source directory to target directory directory
echo "Moving directories from '$source_directory' to '$target_dir_directory'"
mv "$source_directory"/*/ "$target_dir_directory"/

