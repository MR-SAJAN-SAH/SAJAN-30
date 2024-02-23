// -Write a program to print your name, roll no, section and branch in separate lines.
package lab1;
import java.util.Scanner;
class a1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name,branch;
        int roll,sec;
        System.out.print("Enter your name : ");
        name=sc.nextLine();
        System.out.print("Enter roll no. : ");
        roll=sc.nextInt();
        System.out.print("Enter your section no. : ");
        sec=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your branch : ");
        branch =sc.nextLine();
        System.out.println("Name : "+name+"\nRoll : "+roll+"\nSection : "+sec+"\nBranch : "+branch);


    }
}