echo "Prime numbers between 1 and 100 are:"
for ((n=2; n<=100; n++))
do
    x=1
    for ((i=2; i<=n/2; i++))
    do
        if [ $((n%i)) -eq 0 ]
        then
            x=0
            break
        fi
    done
    if [ $x -eq 1 ]
    then
        echo $n
    fi
done

read -p "press Enter to exit"