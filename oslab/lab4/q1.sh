read -p "Enter a number : " a
r=`expr $a % 2`
if [ $r -eq 0 ]	
then
        echo "even"
else
	echo "odd"

fi
