/*Define an interface Emploee with a method getDetails() to get emplyee details as Empid and Ename.
Also define a derived interface Manager with a method getDeptDetails() to get department details such as
Deptid and Deptname.Then define a class Head which implements Manager interface and also prints all details
of the employee. Write the complete program to display all details of one head of the department.*/

package lab5;
import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager2 extends Employee {
    void getDeptDetails();
}

class Head implements Manager2 {
    private String empId;
    private String empName;
    private String deptId;
    private String deptName;

    public Head(String empId, String empName, String deptId, String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public void getDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    @Override
    public void getDeptDetails() {
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }

    public void printAllDetails() {
        System.out.println("Head Details:");
        getDetails();
        getDeptDetails();
    }
}

public class a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        String empId = scanner.nextLine();

        System.out.println("Enter Employee Name:");
        String empName = scanner.nextLine();

        System.out.println("Enter Department ID:");
        String deptId = scanner.nextLine();

        System.out.println("Enter Department Name:");
        String deptName = scanner.nextLine();

        Head head = new Head(empId, empName, deptId, deptName);
        head.printAllDetails();
    }
}
