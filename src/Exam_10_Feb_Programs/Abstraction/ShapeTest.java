package Exam_10_Feb_Programs.Abstraction;

public class ShapeTest {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5,3);
        System.out.println("Rectangle Area: "+rectangle.getArea());

        Shape circle = new Circle(4);
        System.out.println("Circle Area: "+circle.getArea());

    }
}
