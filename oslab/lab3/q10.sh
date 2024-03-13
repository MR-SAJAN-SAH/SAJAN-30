echo "Enter the length and breadth of the rectangle:"
read rl
read rb
echo "Enter the breadth and height of triangle:"
read tb
read th
echo "Enter the radius of the circle:"
read radius
echo "Area of the rectangle is:` expr $rl \* $rb ` "
let "area_triangle = ($tb * $th) / 2"
echo "Area of the triangle is: $area_triangle"
c=3.14
area_circle=$(echo "scale=2; $c * $radius * $radius" | bc)
echo "Area of the circle is: $area_circle"

