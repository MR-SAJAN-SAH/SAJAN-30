package lab7;
public class a2 {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: Division by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

