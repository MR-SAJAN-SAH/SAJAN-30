# Write a shell program to fetch the data of a particular student (based on the row information,i.e., ex.
# The student present in the 3rd row of the file) from a stored file. Then calculate anddisplay his total mark 
# and the aggregate percentage secured in a semester. The file containsstudent roll no, name , and marks 
# of five differ subjects in a semester

read -p "Enter file name (filename.txt): " filename
if [ -f $filename ] then
read -p "Enter row number: " row
cat $filename | head -n $row | tail -n 1 | rev | cut -f 1-5 | rev > res.txt
total=0
for word in `cat res.txt`
do
(( total += word ))
done
per=`expr $total / 5`
echo "Total marks scored: $total"
echo "Aggregate percentage: $per%"
else
echo "File doesn't exist."
fi

read -p "Press Enter to exit"