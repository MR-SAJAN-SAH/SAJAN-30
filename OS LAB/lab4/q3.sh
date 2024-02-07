# Write a shell program to enter the mark secured by a student in a particular # subject. Based on the grading system of our university, find and display the # grade (i.e. from "O" to "F") secured by the student in that subject..


read -p "Enter your marks out of 100: " m
if [ $m -le 100 ] && [ $m -gt 90 ]; then
g="O"
elif [ $m -le 90 ] && [ $m -gt 80 ]; then
g="E"
elif [ $m -le 80 ] && [ $m -gt 70 ]; then
g="A"
elif [ $m -le 70 ] && [ $m -gt 60 ]; then
g="B"
elif [ $m -le 60 ] && [ $m -gt 50 ]; then
g="C"
elif [ $m -le 50 ] && [ $m -gt 40 ]; then
g="D"
elif [ $m -le 40 ] && [ $m -gt 0 ]; then
g="F"
else
g="Invalid input"
fi
echo "Grade = $g"

read -p "Press Enter to exit"