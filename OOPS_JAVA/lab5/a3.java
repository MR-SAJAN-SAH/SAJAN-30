/*-Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class
‘Manager’ which uses this interface without implementing bonus() method. Also define another Java class
‘Substaff’ which extends from ‘Manager’ class and implements bonus() method. Write the complete program
to find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by the user as
per the following guidelines –*/

package lab5;
interface Facility{
    void earnings();
    void deductions();
    void bonus();

}
class Manager implements Facility{
    @Override
    public void earnings(){

    }
    @Override
    public void deductions(){

    }
    @Override
    public void bonus(){

    }
}

class Staff extends Manager{

}

public class a3 {
}
