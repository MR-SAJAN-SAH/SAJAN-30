#!/bin/bash
# Write a shell program to take input of two different names and display the same. Then check weather both the names # are same or different

read -p "Enter the first name: " first_name
read -p "Enter the second name: " second_name

echo "First name: $first_name"
echo "Second name: $second_name"

if [ "$first_name" = "$second_name" ]; then
    echo "Both names are the same."
else
    echo "The names are different."
fi

