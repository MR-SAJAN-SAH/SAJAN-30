/*Write a program in java to input and display the details of n number of students having roll, name and cgpa as
data members. Also display the name of the student having lowest cgpa.*/

package lab3;

import java.util.Scanner;

class student{
    int roll;
    String name;
    float cgpa;

    public static void lowest(student[] students) {
        if (students.length == 0) {
            System.out.println("NO students found !");
        }

        student lowests = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].cgpa < lowests.cgpa) {
                lowests = students[i];
            }
        }
        System.out.println(lowests.name+" have lowest gpa of "+lowests.cgpa);
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("CGPA: " + cgpa+"\n");
    }
}

public class a3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter no. of students : ");
        int n=s.nextInt();
        student s1[]=new student[n];

        for(int i=0;i<n;i++){
            s.nextLine();
            System.out.println("Enter details of student "+(i+1));
            s1[i] = new student();
            System.out.print("Name : ");
            s1[i].name=s.nextLine();
            s1[i].roll=s.nextInt();
            s1[i].cgpa=s.nextFloat();
        }

        for(int i=0;i<n;i++){
            s1[i].display();
        }
        student.lowest(s1);
    }

}
