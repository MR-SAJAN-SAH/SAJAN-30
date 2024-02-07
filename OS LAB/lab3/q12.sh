# average of 5 numbers

i=0
sum=0

echo "Enter 5 Numbers"
while [ $i -le 5 ]
do
  read num             
  sum=$((sum + num))    
  i=$((i + 1))
done

avg=$(echo $sum / $N | bc -l)

echo $avg

read -p "Press Enter to exit"