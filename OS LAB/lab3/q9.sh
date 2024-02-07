# shell program for finding simple interest 

read -p "Enter the principle amount : " a
read -p "Enter the time : " b
read -p "enter rate : " c
i=$(($a* $b * $c))
interest=$(($i / 100))
echo "S.I is $interest"

read -p "Press Enter to exit"