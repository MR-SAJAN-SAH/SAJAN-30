/*Write a program in java using constructor overloading concept to calculate the area of a rectangle having
data member as length and breadth. Use default constructor to initialize the value of the data member to zero and
parameterized constructor to initialize the value of data member according to the user input.*/
package lab3;

import java.util.Scanner;

class rectangle{
    private float length;
    private float breadth;

    public rectangle(){
        this.breadth=this.length=0;
    }

    public rectangle(float l,float b){
        this.length=l;
        this.breadth=b;
    }

    public void area(){
        System.out.println("The area of rectangle is : "+this.length*this.breadth +" unit.");
    }

}
public class a6 {
    public static void main(String[] args){
        System.out.print("Enter the length of rectangle : ");
        Scanner s=new Scanner(System.in);
        float l=s.nextFloat();
        System.out.print("Enter the breadth of rectangle : ");
        float b=s.nextFloat();
        rectangle r=new rectangle(l,b);
        r.area();
    }
}
