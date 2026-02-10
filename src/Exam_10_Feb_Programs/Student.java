package Exam_10_Feb_Programs;

public class Student {
    private String name;
    private int rollno;
    private String section;

    public Student(String name, int rollno, String section)
    {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }

    public void display()
    {
        System.out.println("Student: "+name+", Roll No: "+rollno+", Section: "+section);
    }


    public static void main(String[] args) {
        Student s1 = new Student("Bob",101, "A");
        s1.display();
    }
}
