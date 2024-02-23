/*Define two packages as – General and Marketing. In General package define a class ‘employee’ with data
members as empid(protected), ename(private) and a public method as earnings() which calculate total
earnings as earnings basic + DA (80% of basic) + HRA (15% of basic).

In Marketing package define a class ‘sales’ which is extending from ‘employee’ class and
has a method tallowance() which calculates Travelling Allowance as 5% of total earning.
Write the programs to find out total earning of a sales person for the given basic salary
amount and print along with the emp id.*/

package lab6;
import lab5.employee;

class Sales extends employee {

    public Sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public void printTotalEarnings() {
        double totalEarnings = earnings() + tallowance();
        System.out.println("Employee ID: " + empid);
        System.out.println("Total Earnings: " + totalEarnings);
    }
}

public class a1 {
    public static void main(String[] args) {
        Sales salesperson = new Sales(101, "John", 50000);
        salesperson.printTotalEarnings();
    }
}