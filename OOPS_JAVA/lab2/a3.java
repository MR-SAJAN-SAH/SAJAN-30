// Program to sort the user entered list of numbers of any size
package lab2;

import java.util.Scanner;
public class a3 {
    public static void main(String[] args){
        boolean sw;
        int n;
        System.out.println("Enter the total numbers");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" numbers");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){
            sw=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    sw=true;
                }
            }
            if(sw==false){
                break;
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}