# Write a shell program to execute different arithmetic operations (+,-, \*, /) using decimal values

read -p "Enter the first number: " num1
read -p "Enter the second number: " num2
add=$(echo "$num1 + $num2" |bc)
sub=$(echo "$num1 - $num2" |bc)
mul=$(echo "$num1 * $num2" |bc)
div=$(echo "$num1 \ $num2" |bc)
echo " $add      $sub     $mul     $div"

