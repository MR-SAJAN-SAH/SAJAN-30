/*Write a class file – box with three data members(length, width, height) and a method volume() . Also
implement the application class Demo where an object of the box
class is created with user entered dimensions and volume is printed.*/

package lab3;
import java.util.Scanner;
 class box{
    float length;
    float breadth;
    float height;

    public box(float l,float b, float h){
        this.length=l;
        this.breadth=b;
        this.height=h;

    }

    public void volume(){
        System.out.println("Volume of box is "+(this.length*this.breadth*this.height));
    }
}

class demo{
    Scanner sc=new Scanner(System.in);
    float l=sc.nextFloat();
    float b=sc.nextFloat();
    float h=sc.nextFloat();
    box b1=new box(l,b,h);
}

public class a1 {
    public static void main(String[] args){
        System.out.println("Enter length,breadth and height : ");
        demo d=new demo();
        d.b1.volume();
    }
}
