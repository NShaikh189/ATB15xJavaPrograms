package Exam_10_Feb_Programs.Polymorphism;

public class AnimalTest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
