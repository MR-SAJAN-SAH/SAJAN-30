/*Write a program which will overload the area () method and display the area of a circle, triangle and
square as per user choice and user entered dimensions.*/

package lab3;

import java.util.Scanner;

class circle{
    private float radius;
    public circle(float r){
        this.radius=r;
    }
    public void area(){
        System.out.println("The area of circle is : "+this.radius*2*3.14 +" unit.");
    }
}
class triangle{
    private float height;
    private float breadth;

    public triangle(float b,float h){
        this.breadth=b;
        this.height=h;
    }
    public void area(){
        float r=(this.height*this.breadth)/2;
        System.out.println("The area of triangle is : "+r+" unit.");
    }

}

class square{
    private float length;

    public square(float l){
        this.length=l;
    }
    public void area(){
        System.out.println("The area of square is : "+this.length*this.length +" unit.");
    }

}
public class a5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println(" ==>Enter 1 for area of circle \n ==>Enter 2 for area of square \n ==>Enter 3 for area of tiangle");
        int ch=s.nextInt();
        switch (ch){
            case 1:
                System.out.print("Enter the radius : ");
                float r=s.nextFloat();
                circle c=new circle(r);
                c.area();
                break;

            case 2:
                System.out.print("Enter the length : ");
                float l=s.nextFloat();
                square sq=new square(l);
                sq.area();
                break;

            case 3:
                System.out.print("Enter the length : ");
                float le=s.nextFloat();
                System.out.print("Enter the breadth : ");
                float br=s.nextFloat();
                triangle t=new triangle(le,br);
                t.area();
                break;

            default:
                System.out.println("Wrong choice !");
                main(args);
                break;
        }
    }
}
