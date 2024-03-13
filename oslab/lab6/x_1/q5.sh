#!/bin/bash

# Function to print elements of array in reverse order
print_reverse() {
    echo "Elements of array in reverse order:"
    for (( i = ${#array[@]} - 1; i >= 0; i-- )); do
        echo "${array[i]}"
    done
}

# Function to find the element at a given location in the array
find_element() {
    echo "Enter the location of the element to find: "
    read location
    if [ "$location" -ge 0 ] && [ "$location" -lt "${#array[@]}" ]; then
        echo "Element at location $location: ${array[location]}"
    else
        echo "Invalid location. Please enter a valid location."
    fi
}

# Main script starts here
while true; do
    echo "Menu:"
    echo "A) Print the elements of array in reverse order"
    echo "B) Find the element if location is given for array"
    echo "C) Exit"
    echo "Enter your choice (A/B/C): "
    read choice

    case $choice in
        [Aa])
            echo "Enter elements of the array (space-separated):"
            read -a array
            print_reverse
            ;;
        [Bb])
            if [ ${#array[@]} -eq 0 ]; then
                echo "Array is empty. Please input elements first."
            else
                find_element
            fi
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

