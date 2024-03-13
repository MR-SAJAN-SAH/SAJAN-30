# shell program for swapping two numbers without using third variable 


read -p "Enter first value : " a
read -p "Enter second value : " b
echo "Value of a is $a and b is $b"
echo "After swapping"
a=$(($a+$b))
b=$(($a-$b))
a=$(($a-$b))
echo "Value of a is $a and b is $b"

read -p "Press Enter to exit"