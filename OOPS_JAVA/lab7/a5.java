package lab7;

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class a5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgumentException("Exception occurred - CheckArgument");
            } else {
                int sumOfSquares = 0;
                for (String arg : args) {
                    int num = Integer.parseInt(arg);
                    sumOfSquares += num * num;
                }
                System.out.println("Output: " + sumOfSquares);
            }
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }
}
