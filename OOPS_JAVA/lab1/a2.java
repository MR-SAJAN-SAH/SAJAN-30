//Write a program to print the corresponding grade for the given mark using if..else statement in Java
package lab1;

import java.util.Scanner;

public class  a2 {
    public static void main(String[] args){
        System.out.println("Enter your mark : ");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        if(m>100){
            System.out.println("Wrong mark! ");
        }else if(m>=90){
            System.out.println("Grade O");
        } else if (m>=80) {
            System.out.println("Grade E");
        } else if (m>=70) {
            System.out.println("Grade A");
        } else if (m>=60) {
            System.out.println("Grade B");
        } else if (m>=50) {
            System.out.println("Grade C");
        } else if (m>=40) {
            System.out.println("Grade  D");
        } else{
            System.out.println("Fail");
        }
    }
}

