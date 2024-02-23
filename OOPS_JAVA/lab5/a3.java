/*-Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class
‘Manager’ which uses this interface without implementing bonus() method. Also define another Java class
‘Substaff’ which extends from ‘Manager’ class and implements bonus() method. Write the complete program
to find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by the user as
per the following guidelines

earnings basic + DA (80% of basic) + HRA (15% of basic)
deduction PF 12% of basic
bonus 50% of basic–*/

package lab5;

import java.util.Scanner;

interface Facility{
    void earnings(int bsalary);
    void deductions(int bsalary);
    void bonus(int bsalary);

}
class Manager implements Facility{

    @Override
    public void earnings(int bsalary){
        int totalEarning=bsalary+((bsalary/100)*80)+((bsalary/100)*15);
        System.out.println("Your total earning is "+totalEarning);
    }
    @Override
    public void deductions(int bsalary){
        int deduct=((bsalary/100)*12);
        System.out.println("Your total deducted amount is "+deduct);
    }

    @Override
    public void bonus(int bsalary) {

    }
}

class Staff extends Manager {

    @Override
    public void bonus(int bsalary){
        int toatlBonus=bsalary/2;
        System.out.println("Your total bonus is "+toatlBonus);
    }
}

public class a3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Staff staff=new Staff();
        System.out.println("Enter the basic salary of the staff: ");
        int bsalary=sc.nextInt();
        staff.earnings(bsalary);
        staff.deductions(bsalary);
        staff.bonus(bsalary);

    }
}
