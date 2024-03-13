#!/bin/bash

# Function to calculate total marks and percentage
calculate_total_and_percentage() {
    marks_array=("$@")  # Convert input arguments to an array
    total_marks=0
    for mark in "${marks_array[@]:2}"; do
        total_marks=$((total_marks + mark))
    done
    percentage=$(echo "scale=2; $total_marks / 5" | bc)
    echo "Total marks: $total_marks"
    echo "Percentage: $percentage%"
}

# Main script starts here
echo "Enter the filename containing student data: "
read filename

echo "Enter the row number of the student to fetch: "
read row_number

# Check if the file exists
if [ ! -f "$filename" ]; then
    echo "File '$filename' does not exist."
    exit 1
fi

# Fetch student data from the specified row number
student_data=$(sed "${row_number}q;d" "$filename")

# Check if the row number is valid and student data is fetched
if [ -z "$student_data" ]; then
    echo "Row number $row_number is invalid or no student found at that row."
    exit 1
fi

# Split student data into individual fields
IFS=' ' read -ra student_fields <<< "$student_data"

echo "Student Roll No: ${student_fields[0]}"
echo "Student Name: ${student_fields[1]}"
echo "Marks in 5 Subjects: ${student_fields[@]:2}"

# Calculate total marks and percentage
calculate_total_and_percentage "${student_fields[@]}"

