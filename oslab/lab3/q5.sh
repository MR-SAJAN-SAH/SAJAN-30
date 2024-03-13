# Write a shell program to execute different arithmetic operations (+,-, \*, /) using integer values

read -p "Enter the first number: " num1
read -p "Enter the second number: " num2
add=$(expr $num1 + $num2)
sub=$(expr $num1 - $num2)
mul=$(expr $num1 \* $num2)
div=$(expr $num1 / $num2)
echo " $add      $sub     $mul     $div"

