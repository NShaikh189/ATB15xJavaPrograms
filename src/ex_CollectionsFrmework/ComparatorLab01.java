package ex_CollectionsFrmework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLab01 {

    public static void main(String[] args) {
        Employee e1 = new Employee(121,"Alice");
        Employee e2 = new Employee(23,"John");
        Employee e3 = new Employee(104,"Derek");

        List<Employee> eList = new ArrayList<>();
        eList.add(e1);
        eList.add(e2);
        eList.add(e3);

        Comparator<Employee> idComparator = (emp1,emp2) -> emp1.getEid()-emp2.getEid();

        Collections.sort(eList,idComparator);
        System.out.println(eList);
    }
}

class Employee
{
    public Employee(int eid, String ename)
    {
        this.eid = eid;
        this.ename = ename;
    }
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    private int eid;
    private String ename;

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                '}';
    }
}