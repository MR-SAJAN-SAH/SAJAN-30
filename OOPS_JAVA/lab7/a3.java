package lab7;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class InputProcessor {
    public void processInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        } else {
            System.out.println("Double value of the entered number: " + (double) number);
        }
    }

}
public class a3{
    public static void main(String[] args) {
        InputProcessor processor = new InputProcessor();
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int a=sc.nextInt();
            processor.processInput(a);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}

