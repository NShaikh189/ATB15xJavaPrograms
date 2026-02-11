package Exam_10_Feb_Programs.MethodOverridingDemo;

public class MethodOverridingTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();
    }
}
