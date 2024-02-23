/*A Plastic manufacturer sells plastic in different shapes like 2D
sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per
cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by
the user where 3D inherits from 2D.*/

package lab4;
import java.util.Scanner;
class sheet {
    double length;
    double width;

    sheet(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double price() {
        return length * width * 40;
    }
}

class box extends sheet {
    double height;
    box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    double price() {
        return super.price() + this.length * this.width * this.height * 60;
    }
}

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions for plastic (in feet):");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        sheet plastic = new box(length, width, height);
        double cost = plastic.price();

        System.out.println("Cost of plastic: Rs " + cost);
    }
}

