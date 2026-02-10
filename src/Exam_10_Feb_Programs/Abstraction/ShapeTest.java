package Exam_10_Feb_Programs.Abstraction;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,3);
        Circle circle = new Circle(4);

        //Abstract Shape Implementation
        System.out.println("Rectangle Area: "+rectangle.getArea());
        System.out.println("Circle Area: "+circle.getArea());

        //Drawable Interface Implementation
        circle.draw();
        rectangle.draw();
    }
}
