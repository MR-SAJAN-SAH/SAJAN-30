#!/bin/bash

# Function to input 10 numbers into an array and find their sum
input_and_sum() {
    echo "Enter 10 numbers: "
    sum=0
    for (( i = 0; i < 10; i++ )); do
        read -p "Number $((i+1)): " num
        numbers[$i]=$num
        sum=$((sum + num))
    done
    echo "Sum of the numbers: $sum"
}

# Function to sort the elements of the array using bubble sort
bubble_sort() {
    n=${#numbers[@]}
    for (( i = 0; i < n-1; i++ )); do
        for (( j = 0; j < n-i-1; j++ )); do
            if [ "${numbers[j]}" -gt "${numbers[j+1]}" ]; then
                temp=${numbers[j]}
                numbers[j]=${numbers[j+1]}
                numbers[j+1]=$temp
            fi
        done
    done
    echo "Sorted array:"
    echo "${numbers[@]}"
}

# Main script starts here
while true; do
    echo "Menu:"
    echo "A) Input 10 numbers and find their sum"
    echo "B) Sort the elements of the array using bubble sort"
    echo "C) Exit"
    echo "Enter your choice (A/B/C): "
    read choice

    case $choice in
        [Aa])
            input_and_sum
            ;;
        [Bb])
            echo "Enter 10 numbers to sort: "
            read -a numbers
            bubble_sort
            ;;
        [Cc])
            echo "Exiting..."
            exit 0
            ;;
        *)
            echo "Invalid choice. Please enter A, B, or C."
            ;;
    esac
done

