/*Write a program in Java to create a class Rectangle having data members length and breadth and three methods
called read, calculate and display to read the values of length and breadth, calculate the area and perimeter
of the rectangle and display the result respectively.*/

package lab3;

import java.util.Scanner;

class rectangle2{
    private float length;
    private float bradth;

    public void read(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        this.length=s.nextFloat();
        System.out.print("Enter breadth of rectangle : ");
        this.bradth=s.nextFloat();
    }
    private void calculateArea(){
        System.out.println("Area of rectangle is "+this.length*this.bradth);
    }
    private void calculatePerimeter(){
        System.out.println("Perimeter of rectangle is "+(this.bradth+this.length)*2);
    }
    public void display(){
        this.calculateArea();
        this.calculatePerimeter();
    }
}

public class a2 {
    public static void main(String[] args){
        rectangle2 r=new rectangle2();
        r.read();
        r.display();
    }
}
