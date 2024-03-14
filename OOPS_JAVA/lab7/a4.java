package lab7;

import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void inputTime() throws HrsException, MinException, SecException {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter hours: ");
            hours = Integer.parseInt(scanner.nextLine());
            if (hours < 0 || hours > 24) {
                throw new HrsException("Hours should be between 0 and 24");
            }

            System.out.print("Enter minutes: ");
            minutes = Integer.parseInt(scanner.nextLine());
            if (minutes < 0 || minutes > 60) {
                throw new MinException("Minutes should be between 0 and 60");
            }

            System.out.print("Enter seconds: ");
            seconds = Integer.parseInt(scanner.nextLine());
            if (seconds < 0 || seconds > 60) {
                throw new SecException("Seconds should be between 0 and 60");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            inputTime(); // Retry input if invalid
        }
    }

    public static void main(String[] args) {
        Time time = new Time();
        try {
            time.inputTime();
            System.out.println("Time entered successfully: " + time.hours + ":" + time.minutes + ":" + time.seconds);
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
