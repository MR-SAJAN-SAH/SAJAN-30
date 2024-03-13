#!/bin/bash

echo "Prime numbers between 1 and 100 are:"

# Loop through numbers from 2 to 100
for (( num=2; num<=100; num++ )); do
    is_prime=true

    # Check if the number is divisible by any number from 2 to its square root
    for (( divisor=2; divisor<=num/2; divisor++ )); do
        if [ $((num % divisor)) -eq 0 ]; then
            is_prime=false
            break
        fi
    done

    # If the number is prime, print it
    if [ "$is_prime" = true ]; then
        echo "$num"
    fi
done

