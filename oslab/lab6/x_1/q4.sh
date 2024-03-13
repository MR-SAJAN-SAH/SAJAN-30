#!/bin/bash

# Function to merge two arrays without using a third array
merge_arrays() {
    merged_array=("${array1[@]}" "${array2[@]}")
    echo "Merged array without using a third array:"
    echo "${merged_array[@]}"
}

# Function to display the locations of duplicate elements in the array
display_duplicate_locations() {
    declare -A locations
    for (( i = 0; i < ${#array1[@]}; i++ )); do
        element="${array1[i]}"
        if [ "${locations[$element]}" ]; then
            locations[$element]+=",$i"
        else
            locations[$element]="$i"
        fi
    done

    echo "Locations of duplicate elements:"
    for element in "${!locations[@]}"; do
        if [[ "${locations[$element]}" =~ "," ]]; then
            echo "$element: ${locations[$element]}"
        fi
    done
}

# Function to delete duplicate elements by their locations in the array
delete_duplicate_elements() {
    declare -A seen
    new_array=()
    for (( i = 0; i < ${#array1[@]}; i++ )); do
        element="${array1[i]}"
        if [ ! "${seen[$element]}" ]; then
            new_array+=("$element")
            seen[$element]=1
        fi
    done

    echo "Array after deleting duplicate elements:"
    echo "${new_array[@]}"
}

# Main script starts here
while true; do
    echo "Menu:"
    echo "A) Merge the contents of two given arrays (without using a third array)"
    echo "B) Display the locations of duplicate elements in the given array"
    echo "C) Delete the duplicate elements by their locations in the given array"
    echo "D) Exit"
    echo "Enter your choice (A/B/C/D): "
    read choice

    case $choice in
        [Aa])
            echo "Enter elements of first array (space-separated):"
            read -a array1
            echo "Enter elements of second array (space-separated):"
            read -a array2
            merge_arrays
            ;;
        [Bb])
            echo "Enter elements of the array (space-separated):"
            read -a array1
            display_duplicate_locations
            ;;
        [Cc])
            echo "Enter elements of the array (space-separated):"
            read -a array1
            delete_duplicate_elements
            ;;
        [Dd])
            echo "Exiting..."
            exit 0
            ;;
        *)
            echo "Invalid choice. Please enter A, B, C, or D."
            ;;
    esac
done

