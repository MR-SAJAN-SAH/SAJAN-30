//Program to find no. of objects created out of a class using ‘static’ modifier.
package lab2;

import java.util.Scanner;

class test{
    static int noOfObj=0;
    public test(){
        noOfObj++;
    }
}
public class a4 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number you want to create object ");
        int n=s.nextInt();
        test a[]=new test[n];
        for (int i=0;i<n;i++) {
            a[i] = new test();

        }
        System.out.println(test.noOfObj + " Object of test class created");
    }
}
