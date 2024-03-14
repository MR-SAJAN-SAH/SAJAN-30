package lab7;
public class a1 {
    public static void main(String[] args) {
        try {
            // Creating an array with size 5
            int[] arr = new int[5];
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
           // e.printStackTrace();
        }
    }
}
