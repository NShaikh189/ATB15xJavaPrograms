package Exam_10_Feb_Programs.Abstraction;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return (Math.PI*radius*radius);
    }
}
