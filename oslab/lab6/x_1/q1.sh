#!/bin/bash

# Define the number of rows
rows=5

# Loop to print the upper half of the pattern
for (( i = 1; i <= rows; i++ )); do
    for (( j = 1; j <= i; j++ )); do
        echo -n "1 "
    done
    echo ""
done

# Loop to print the lower half of the pattern
for (( i = rows-1; i >= 1; i-- )); do
    for (( j = 1; j <= i; j++ )); do
        echo -n "1 "
    done
    echo ""
done


