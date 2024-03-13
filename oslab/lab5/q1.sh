echo "Enter a year:"
read n
if [ $((n % 4)) -eq 0 ] && [ $((n % 100)) -ne 0 ] || [ $((n % 400)) -eq 0 ]
then
	    echo "$n is a leap year"
    else
	        echo "$n is not a leap year"
fi

