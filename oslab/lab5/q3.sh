#!/bin/bash

echo "Enter a string: "
read input_string
cleaned_string=$(echo "$input_string" | tr -d ' ' | tr '[:upper:]' '[:lower:]')

reversed_string=$(echo "$cleaned_string" | rev)

if [ "$cleaned_string" = "$reversed_string" ]; then
    echo "$input_string is a palindrome."
else
    echo "$input_string is not a palindrome."
fi

