# Write a shell program to take the input of two different file names and check whether the file exists or not. If
# the file exists then copy the content of the first file to second file and also append the content of the second
# file to first file.


read -p "Enter the first filename: " first_file
read -p "Enter the second filename: " second_file

if [ ! -f "$first_file" ]; then
    echo "Error: File '$first_file' does not exist."
    exit 1
fi

if [ ! -f "$second_file" ]; then
    echo "Error: File '$second_file' does not exist."
    exit 1
fi

cp "$first_file" "$second_file"
cat "$second_file" >> "$first_file"

echo "Content of '$first_file' copied to '$second_file' and content of '$second_file' appended to '$first_file'."
read -p "Press Enter to exit"