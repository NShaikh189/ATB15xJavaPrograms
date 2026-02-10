package Exam_10_Feb_Programs.Abstraction;

import Exam_10_Feb_Programs.Interfaces.Drawable;

public class Circle extends Shape implements Drawable {

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea() {

        return (Math.PI*radius*radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circles");
    }
}
