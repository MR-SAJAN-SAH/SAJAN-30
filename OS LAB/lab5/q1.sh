
echo "Enter a year:"
read n
if [ ` expr $n % 4 ` == 0 ]
then
                echo "$n is a leap year";
        elif [ ` expr $n % 400 ` == 0 ]
        then
                        echo "$n is a leap year"
                else
                                echo "$n is not a leap year";
fi

read -p "Press Enter to exit"