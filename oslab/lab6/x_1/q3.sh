#!/bin/bash

# Function to check if a number is prime
is_prime() {
    num=$1
    if [ $num -le 1 ]; then
        return 1
    fi
    for (( i=2; i*i<=num; i++ )); do
        if [ $((num % i)) -eq 0 ]; then
            return 1
        fi
    done
    return 0
}

# Function to find 10 consecutive prime numbers and store their sum in an array
find_consecutive_primes() {
    primes_found=0
    num=2
    while [ $primes_found -lt 10 ]; do
        if is_prime "$num"; then
            primes[primes_found]=$num
            primes_found=$((primes_found + 1))
        fi
        num=$((num + 1))
    done
    sum=0
    for prime in "${primes[@]}"; do
        sum=$((sum + prime))
    done
    echo "Sum of 10 consecutive prime numbers: $sum"
}

# Function to find the maximum and minimum among all elements in the array
find_max_min() {
    max=${numbers[0]}
    min=${numbers[0]}
    for num in "${numbers[@]}"; do
        if [ "$num" -gt "$max" ]; then
            max="$num"
        fi
        if [ "$num" -lt "$min" ]; then
            min="$num"
        fi
    done
    echo "Maximum element: $max"
    echo "Minimum element: $min"
}

# Main script starts here
while true; do
    echo "Menu:"
    echo "D) Find the sum of any 10 consecutive prime numbers and store them in an array"
    echo "E) Find the max and min among all elements in the same array"
    echo "F) Exit"
    echo "Enter your choice (D/E/F): "
    read choice

    case $choice in
        [Dd])
            find_consecutive_primes
            ;;
        [Ee])
            echo "Enter 10 numbers: "
            for (( i = 0; i < 10; i++ )); do
                read -p "Number $((i+1)): " numbers[$i]
            done
            find_max_min
            ;;
        [Ff])
            echo "Exiting..."
            exit 0
            ;;
        *)
            echo "Invalid choice. Please enter D, E, or F."
            ;;
    esac
done

