package lab10;

import java.util.Scanner;

class CounterThread extends Thread {
    private String threadName;
    private int lowerRange;
    private int upperRange;

    public CounterThread(String threadName, int lowerRange, int upperRange) {
        this.threadName = threadName;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    public void run() {
        System.out.println("Thread - " + threadName);
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print("Counter - " + i + " ");
            try {
                Thread.sleep(5); // Sleep for 5 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the thread: ");
        String threadName = scanner.nextLine();

        System.out.print("Enter the lower range of the counter: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter the upper range of the counter: ");
        int upperRange = scanner.nextInt();

        CounterThread thread = new CounterThread(threadName, lowerRange, upperRange);
        thread.start();

        scanner.close();
    }
}
