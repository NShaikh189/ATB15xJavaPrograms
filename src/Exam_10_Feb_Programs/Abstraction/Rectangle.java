package Exam_10_Feb_Programs.Abstraction;

import Exam_10_Feb_Programs.Interfaces.Drawable;
import org.w3c.dom.css.Rect;

public class Rectangle extends Shape implements Drawable {

    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width=width;
    }

    @Override
    public double getArea() {

        return length*width;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing a Rectangle");
    }
}
