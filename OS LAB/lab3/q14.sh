# Accept a file from the user and cut the specific string and write it into separate file.

read -p "Enter the filename: " filename

if [ ! -f "$filename" ]; then
    echo "Error: File '$filename' does not exist."
    exit 1
fi

read -p "Enter the string to cut: " cut_string
read -p "Enter the output filename: " output_filename

while IFS= read -r line; do
    cut_result=$(echo "$line" | grep -o "$cut_string")
    echo "$cut_result" >> "$output_filename"
done < "$filename"

echo "String cut and written to '$output_filename'."

read -p "Press Enter to exit"
