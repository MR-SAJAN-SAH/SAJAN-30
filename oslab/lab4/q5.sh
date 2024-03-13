#!/bin/bash

# Task 5: Display Date and Time with Greeting Message
current_time=$(date +"%l:%M:%S %p %Z")  # Time in hour:minute:second AM/PM timezone format
current_date=$(date +"%d/%m/%Y")        # Date in dd/mm/yyyy format
hour=$(date +"%H")                      # Extract hour from current time

# Determine the greeting message based on the current hour
if [ "$hour" -ge 5 ] && [ "$hour" -lt 12 ]; then
    greeting="Good Morning"
elif [ "$hour" -ge 12 ] && [ "$hour" -lt 17 ]; then
    greeting="Good Afternoon"
elif [ "$hour" -ge 17 ] && [ "$hour" -lt 20 ]; then
    greeting="Good Evening"
else
    greeting="Good Night"
fi

# Print the greeting message, date, and time
echo "$greeting! Today's date is $current_date and the current time is $current_time."

