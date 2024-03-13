#!/bin/bash

echo "Input 5 numbers:"

# Initialize variables
total=0
count=0

# Loop to input 5 numbers
for (( i=1; i<=5; i++ ))
do
    echo "Enter number $i:"
    read num
    total=$((total + num))
    count=$((count + 1))
done

# Calculate average
average=$(echo "scale=2; $total / $count" | bc)

echo "The average of the 5 numbers is: $average"

