// Write a C program to copy the content of a file from one to other. Create the binary executable of the same //program to check weather content can be copied or not.


#include<stdio.h>
int main(int argc.char *argv[]){
FILE *fs, *ft;
int ch;
if(argcl=3){
  printf("Invalide numbers of arguments.");
  return 1:
}

fs=fopen(argv[1],"r");
if(fs==NULL){
  printf("Can't find the source file.");
  retum 1:
}

ft=fopen(argv[2]'w');
if(ft==NULL) {
  printf("Can't open target file.");
  fclose(fs); 
  retum 1;
}

while(1){
ch=fgetc(fs);
if (feof(fs)) break;
fputc(ch,ft); 
}
fclose(fs); 
fclose(ft);
return 0;
}