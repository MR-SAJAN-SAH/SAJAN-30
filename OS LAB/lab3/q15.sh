# Accept a file from user and cut the middle 5 lines and redirect to another file.

echo "Enter the input filename:"
read input_file

echo "Enter the output filename:"
read output_file

total_lines=$(wc -l < "$input_file")

start_line=$((total_lines / 2 - 2))
end_line=$((start_line + 4))

sed -n "${start_line},${end_line}p" "$input_file" > "$output_file"

echo "Middle 5 lines extracted from '$input_file' and saved to '$output_file'."

read -p "Press Enter to exit"
