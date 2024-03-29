//Find the largest among 3 user entered no. using Java by sajan kumar sah

package lab2;

import java.util.Scanner;

public class a1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = s.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = s.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = s.nextDouble();
        double largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);

    }
}
