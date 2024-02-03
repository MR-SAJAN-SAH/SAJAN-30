////Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrix in Java.
package lab2;
import java.util.Scanner;
public class a6{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter elements of a 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        int left = 0;
        for (int i = 0; i < 3; i++) {
            left+= matrix[i][i];
        }

        int right= 0;
        for (int i = 0; i < 3; i++) {
            right+= matrix[i][2 - i];
        }
        System.out.println("Sum of left diagonal elements: " + left);
        System.out.println("Sum of right diagonal elements: " + right);
    }
}
