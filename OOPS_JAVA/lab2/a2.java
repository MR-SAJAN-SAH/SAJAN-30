//Accept 10 numbers and check how many of them are even and how many are odd.

package lab2;

import java.util.Scanner;
public class a2 {
    public static void main(String[] args){
        int[] arr=new int[10];
        Scanner s=new Scanner(System.in);
        int n=0,m=0;
        System.out.println("Enter 10 numbers ");
        for(int i=0;i<10;i++){
            arr[i]=s.nextInt();
            if(arr[i]%2==0){
                n++;
            }else{
                m++;
            }
        }
        System.out.println("Total "+n+" are even and "+m+" are odd numbers.");

    }
}
