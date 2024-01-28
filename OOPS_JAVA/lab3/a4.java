/*Write a program to overload subtract method with various parameters in a class in Java. Write the
driver class to use the different subtract methods using object.*/

package lab3;

import java.util.Scanner;

class Subtraction {
    public double subtract(double a, double b) {
        return a - b;
    }
    public double subtract(double[] arr) {
        double result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result -= arr[i];
        }
        return result;
    }
}
public class a4 {
    public static void main(String[] args){
        Subtraction sub = new Subtraction();
        System.out.print("Enter two number : ");
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        Double b=s.nextDouble();
        double res=sub.subtract(a,b);
        System.out.println("The subtraction is "+res);
    }
}
