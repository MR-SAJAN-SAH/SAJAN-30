package lab10;

class SharedPrinter {
    public synchronized void print(String word) {
        System.out.println(Thread.currentThread().getName() + ": " + word);
    }
}

class PrintThread extends Thread {
    private SharedPrinter printer;
    private String[] words;

    public PrintThread(SharedPrinter printer, String[] words) {
        this.printer = printer;
        this.words = words;
    }

    @Override
    public void run() {
        for (String word : words) {
            printer.print(word);
        }
    }
}

public class a2 {
    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();

        String[] words1 = {"I", "Love", "java", "Very", "Much"};
        String[] words2 = {"I", "Love", "java", "Very", "Much"};

        PrintThread thread1 = new PrintThread(sharedPrinter, words1);
        PrintThread thread2 = new PrintThread(sharedPrinter, words2);

        thread1.setName("Thread 1");
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}

