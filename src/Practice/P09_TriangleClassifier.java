package Practice;

import java.util.Scanner;

public class P09_TriangleClassifier {
    public static void main() {
        int side1, side2, side3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Triangle Classifier====");
        System.out.println("Enter the value of side1");
        side1 = scanner.nextInt();

        System.out.println("Enter the value of side2");
        side2 = scanner.nextInt();

        System.out.println("Enter the value of side3");
        side3 = scanner.nextInt();

//        String e_msg = (side1 == side2 && side2 == side3) ? "Equilateral Triangle" : (side1 == side2 || side2 == side3 || side1 == side3) ? "Isoceles Triangle" : "Scalene Triangle";
//        System.out.println(e_msg);
        if (side1 <= 0 && side2 <= 0 && side3 <= 0) {
            System.out.println("Enter number greater than 0");
        } else if (side1 == side2 && side2 == side3)
            System.out.println("Equilateral Triangle");
        else if (side1 == side2 || side1 == side3 || side2 == side3)
            System.out.println("Isoceles Triangle");
        else
            System.out.println("Scalene Triangle");
        scanner.close();

    }

}
