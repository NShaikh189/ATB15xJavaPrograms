package Exam_10_Feb_Programs.Interfaces;

public class Duck implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water!");
    }
}
