package Exam_10_Feb_Programs.Inheritance;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee manager = new Manager(60000,10000);
        System.out.println("Manager Salary: "+manager.salary());

        Employee developer = new Developer(50, 160);
        System.out.println("Developer Salary: "+developer.salary()  );
    }
}
