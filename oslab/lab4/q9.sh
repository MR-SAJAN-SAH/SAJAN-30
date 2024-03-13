#!/bin/bash

while true; do
    echo "Menu:"
    echo "1. List files"
    echo "2. Create directory"
    echo "3. Change directory"
    echo "4. Remove directory"
    echo "5. Create file"
    echo "6. Copy file"
    echo "7. Remove file"
    echo "8. Exit"
    echo "Enter your choice: "
    read choice

    case $choice in
        1)
            echo "Listing files:"
            ls
            ;;
        2)
            echo "Enter directory name to create: "
            read dir_name
            mkdir "$dir_name"
            echo "Directory '$dir_name' created."
            ;;
        3)
            echo "Enter directory path to change to: "
            read dir_path
            cd "$dir_path" || echo "Unable to change directory to '$dir_path'"
            ;;
        4)
            echo "Enter directory name to remove: "
            read dir_name
            rm -r "$dir_name"
            echo "Directory '$dir_name' removed."
            ;;
        5)
            echo "Enter file name to create: "
            read file_name
            touch "$file_name"
            echo "File '$file_name' created."
            ;;
        6)
            echo "Enter source file path: "
            read source_file
            echo "Enter destination file path: "
            read dest_file
            cp "$source_file" "$dest_file"
            echo "File copied from '$source_file' to '$dest_file'."
            ;;
        7)
            echo "Enter file name to remove: "
            read file_name
            rm "$file_name"
            echo "File '$file_name' removed."
            ;;
        8)
            echo "Exiting..."
            exit 0
            ;;
        *)
            echo "Invalid choice. Please enter a number from 1 to 8."
            ;;
    esac
done

