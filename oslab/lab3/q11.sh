#!/bin/bash

echo "Temperature conversion:"
echo "1. Fahrenheit to Celsius"
echo "2. Celsius to Fahrenheit"
echo "Enter your choice (1 or 2): "
read choice

case $choice in
    1)
        echo "Enter temperature in Fahrenheit: "
        read fahrenheit
        celsius=$(echo "scale=2; ($fahrenheit-32)*5/9" | bc)
        echo "$fahrenheit°F is $celsius°C"
        ;;
    2)
        echo "Enter temperature in Celsius: "
        read celsius
        fahrenheit=$(echo "scale=2; ($celsius*9/5)+32" | bc)
        echo "$celsius°C is $fahrenheit°F"
        ;;
    *)
        echo "Invalid choice"
        ;;
esac

