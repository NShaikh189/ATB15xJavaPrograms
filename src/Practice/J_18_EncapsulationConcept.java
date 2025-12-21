package Practice;

/*
- Accessing the private properties of the class using the public layer
- use getter and setter methods to access the private data members of the class
- private members are accessible only within the class, within the same package only
- constructor can be used to initialize the private members but user will not be able to change values later
 */
public class J_18_EncapsulationConcept {

    private int emp_id;
    private String emp_name;
    private byte emp_age;

    public int getEmp_id()
    {
        return this.emp_id;
    }

    public void setEmp_id(int eid)
    {
        this.emp_id = eid;
    }

    public String getEmp_name()
    {
        return this.emp_name;
    }

    public void setEmp_name(String empName)
    {
        this.emp_name=empName;
    }

    public byte getEmp_age()
    {
        return this.emp_age;
    }

    public void setEmp_age(byte age)
    {
        this.emp_age=age;
    }

}
