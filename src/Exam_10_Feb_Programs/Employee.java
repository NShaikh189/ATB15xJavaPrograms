package Exam_10_Feb_Programs;

public class Employee {

    private int eid;
    private String empName;
    private double salary;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setEid(1);
        e1.setEmpName("John Doe");
        e1.setSalary(50000);

        System.out.println("Employee ID: "+e1.getEid());
        System.out.println("Employee Name: "+e1.getEmpName());
        System.out.println("Employee Salary: "+e1.getSalary());
    }
}
