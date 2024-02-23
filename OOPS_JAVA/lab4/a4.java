/* Write a class Account containing acc_no, balance as data
members and two methods as input() for taking input from user and disp() method to
display the details. Create a subclass Person which has name and aadhar_no as
extra data members and override disp() function. Write the complete progrm to take
and print details of three persons.*/

package lab4;

import java.util.Scanner;

class Account{
    int acc_no;
    int balance;

    public void disp(){
        System.out.println(this.acc_no+" is your account number.");
        System.out.println(this.balance+" is your balance available.");
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the account number : ");
        this.acc_no=sc.nextInt();
        System.out.println("Enter the balance : ");
        this.balance=sc.nextInt();
    }
}

class Person extends Account{
    String name;
    int aahar_no;
    Person(String name,int adh){
        this.name=name;
        this.aahar_no=adh;
    }
    @Override
    public void disp(){
        System.out.println("Your name is "+this.name);
        System.out.println("Your aadhar number is "+this.aahar_no);
        System.out.println(super.acc_no+" is your account number.");
        System.out.println(super.balance+" is your balance available.\n");

    }
}
public class a4 {
    public static void main(String[] args){
        Person p1=new Person("Sajan",99889988);
        Person p2=new Person("Prabhat",99889977);
        Person p3=new Person("Anil",99889966);
        p1.input();
        p2.input();
        p3.input();
        p1.disp();
        p2.disp();
        p3.disp();

    }
}
