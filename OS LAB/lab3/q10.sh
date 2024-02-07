# Write a shell program to calculate area of triangle, rectangle, and circle.

echo "Enter the breadth and height of the triangle:"
read tb
read th
t=$(echo "$tb * $th" | bc)
area_triangle=$(echo "scale=2; $t / 2" | bc)

echo "Enter the length and breadth of the rectangle:"
read rl
read rb
area_rectangle=$(echo "scale=2; $rl * $rb" | bc)

echo "Enter the radius of the circle:"
read radius
c=3.14
area_circle=$(echo "scale=2; $c * $radius * $radius" | bc)

echo "Area of the triangle is: $area_triangle"
echo "Area of the rectangle is: $area_rectangle"
echo "Area of the circle is: $area_circle"

read -p "Press Enter to exit"
