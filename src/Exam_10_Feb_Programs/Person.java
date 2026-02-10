package Exam_10_Feb_Programs;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.println("Name: "+name+", Age: "+age);
    }


    public static void main(String[] args) {
        Person p1 = new Person("John",25);
        Person p2 = new Person("Alice", 30);

        p1.display();
        p2.display();
    }
}
