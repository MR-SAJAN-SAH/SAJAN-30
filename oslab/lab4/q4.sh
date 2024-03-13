#!/bin/bash
read -p "Enter UserName : " user
user1=$(whoami)
if [[ $user == $user1 ]]
then
        echo "$user is loged in"
else
        echo "$user is not loged in"
fi

