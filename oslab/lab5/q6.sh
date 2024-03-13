#!/bin/bash

home_directory="$HOME"

echo "Files starting with '.bash' in your home directory:"

# Use the find command to locate files starting with '.bash' in the home directory
find "$home_directory" -maxdepth 1 -type f -name '.bash*' -exec basename {} \;

