package Exam_10_Feb_Programs.Inheritance;

public class Developer extends Employee {

    private double hourRate;
    private double hours;

    public Developer(double hourRate, double hours)
    {
        this.hourRate = hourRate;
        this.hours = hours;
    }

    @Override
    public double salary() {
        return hourRate*hours;

    }
}
