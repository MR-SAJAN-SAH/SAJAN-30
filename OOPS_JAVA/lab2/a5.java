//Find the no. of occurrence of each element in a user entered list of nos.
package lab2;

import java.util.Scanner;
public class a5 {
    public static void main(String[] args){
        System.out.print("Enter the total.no : ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter "+n+" numbers ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int a,b;
        for(int i=0;i<n;i++){
            a=0;
            for (int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    a++;
                }
            }
            System.out.println("Occurence of " + arr[i] + " = " + a);

        }
    }
}

