# Write a menu based shell program that will carry out the following file management operations based on the specified choice value. 1-List files, 2- Create # directory, 3-Change directory, 4- Remove directory, 5 Create file, 6-Copy file, 7 remove file.

echo "Enter which menu you wanna select."
echo "1 - List files"
echo "2 - Create Directory"
echo "3 - Change Directory"
echo "4 - Remove Directory"
echo "5 - Create File"
echo "6 - Copy File"
echo "7 - Remove File"
read op
case $op in
1)ls
;;
2)read -p "Enter the name of the directory you wanna create: " temp
if [ ! -d "$temp" ]; then
mkdir $temp;echo "Created successfully"
else
echo "Directory already exists"
fi
;;
3)read -p "Enter the path where you wanna move: " temp
cd $temp
;;
4)read -p "Enter the name of the directory you wanna remove: " temp
if [ -d "$temp" ]; then
rm -rf "$temp"
echo "Removed successfully"
else
echo "Directory doesn't exists"
fi
;;
5)read -p "Enter the name of the file (without .txt): " temp
if [ -e "$temp" ]; thenecho "File already exists"
else
echo "enter text here" >> "$temp".txt
fi
;;
6)read -p "Please provide a path to the file: " srcpath

 read -p "Please provide a path to the file: " dstpath
if [ ! -f "$srcpath" ]; then
echo "Source path: $srcpath doesn't exist"
else
mkdir -p "$dstpath"
cp -r "$srcpath" "$dstpath"
echo "Copied successfully"
fi
;;
7)read -p "Please provide a path to the file: " path
if [ ! -f "$path" ]; then
echo "Source path: $path doesn't exist"
else
rm "$path"
echo "removed successfully"
fi
;;
*)echo "invalid option"
;;
esac

read -p "Press Enter to exit"