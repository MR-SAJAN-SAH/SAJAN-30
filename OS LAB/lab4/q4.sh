# Write a shell program to check whether a given user is currently logged in or not.
read -p "Enter the username to check: " username

# Check if the user is logged in
if who | grep -wq "^$username "; then
    echo "$username is currently logged in."
else
    echo "$username is not currently logged in."
fi


read -p "Press Enter to exit"