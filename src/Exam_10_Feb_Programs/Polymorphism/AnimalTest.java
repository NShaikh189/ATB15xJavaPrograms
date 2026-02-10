package Exam_10_Feb_Programs.Polymorphism;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
