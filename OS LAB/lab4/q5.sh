# Write a shell program to display the Date in "dd/mm/yyyy" format and the time in "hour: minute: second AM/PM time 
# zone" with a greeting message like Good Moming, Good Evening etc. based on the current time.

current_hour=$(date +"%H")
current_date=$(date +"%d/%m/%Y")
current_time=$(date +"%I:%M:%S %p %Z")

if [ $current_hour -ge 5 -a $current_hour -lt 12 ]; then
    greeting="Good Morning"
elif [ $current_hour -ge 12 -a $current_hour -lt 17 ]; then
    greeting="Good Afternoon"
else
    greeting="Good Evening"
fi

echo "$greeting! Today's date is $current_date and the time is $current_time"


read -p "Press Enter to exit"