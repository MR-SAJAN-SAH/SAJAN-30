read -p "Enter your marks out of 100: " m
 if [ $m -le 100 ] && [ $m -gt 90 ];
         then
          echo $m :g="O"
 elif [ $m -le 90 ] && [ $m -gt 80 ];
         then
echo  $m:g="E"
 elif [ $m -le 80 ] && [ $m -gt 70 ];
         then
echo  $m g="A"
 elif [ $m -le 70 ] && [ $m -gt 60 ];
         then
echo $m g="B"
 elif [ $m -le 60 ] && [ $m -gt 50 ];
         then
echo $m  g="C"
 elif [ $m -le 50 ] && [ $m -gt 40 ];
         then
echo $m :g="D"
 elif [ $m -le 40 ] && [ $m -gt 0 ];
         then
echo $m :g="F"
         else
        echo  g="Invalid input"
        fi
