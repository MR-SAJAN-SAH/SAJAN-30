/*-Illustrate the usage of abstract class with following Java classes –
 An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and
  an abstract method course()
 A subclass ‘kiitian’ with course() method implementation Write the driver class to print the all
  details of a kiitian object.*/

package lab5;
import java.util.Scanner;

abstract class Student{
    int roll;
    int reg;
    public void getInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll numnber: ");
        this.roll=sc.nextInt();
        System.out.print("Enter registration number: ");
        this.reg=sc.nextInt();

    }
    abstract void course();
}

class Kiitian extends Student{
    void course(){
        System.out.println("Your course is B.Tech");
    }
    void detail(){
        System.out.println(super.roll+" is your roll number.");
        System.out.println(super.reg+" is your registration number.");
    }
}
public class a1 {
    public static void main(String[] args){
        Kiitian obj=new Kiitian();
        obj.getInput();
        obj.course();
        obj.detail();
    }
}
