# Write a shell program to take the input of a file name and check whether the file exists ornot. If the file exists
# then display the last column of every record of the file (Assume that no.of columns in each record of the file 
# may vary) in ascending order.

read -p "Enter file name (filename.txt): " filename 
if [ -f $filename ]then
sed -ri '/\s+$/s///' $filename
cat $filename | rev | cut -f1 | rev | sortelse
echo "File doesn't exist."
fi

read -p "Press Enter to exit"