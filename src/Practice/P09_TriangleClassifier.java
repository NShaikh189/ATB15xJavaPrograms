package Practice;

import java.util.Scanner;

public class P09_TriangleClassifier {
    public static void main() {
        byte side1, side2, side3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Triangle Classifier====");
        System.out.println("Enter the value of side1");
        side1 = scanner.nextByte();

        System.out.println("Enter the value of side2");
        side2 = scanner.nextByte();

        System.out.println("Enter the value of side3");
        side3 = scanner.nextByte();

        String e_msg = (side1 == side2 && side2 == side3) ? "Equilateral Triangle" : (side1 == side2 || side2 == side3 || side1 == side3) ? "Isoceles Triangle" : "Scalene Triangle";
        System.out.println(e_msg);
    }
}
