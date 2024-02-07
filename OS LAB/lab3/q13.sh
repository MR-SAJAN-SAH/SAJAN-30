# Accept a file from user and search occurrence of the string.


echo "Enter the input filename:"
read input_file

echo "Enter the word you want to find:"
read word

if [[ -f "$input_file" ]]; then
 
    count=$(grep -cow "$word" "$input_file")
    echo "The word '$word' appears $count times in '$input_file'."
else
    echo "The file '$input_file' does not exist."
fi
read -p "Press Enter to exit"
