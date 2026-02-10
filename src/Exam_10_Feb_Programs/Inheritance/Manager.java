package Exam_10_Feb_Programs.Inheritance;

public class Manager extends Employee{

    private double baseSalary;
    private double bonus;

    public Manager(double baseSalary, double bonus)
    {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double salary() {
        return baseSalary+bonus;

    }
}
