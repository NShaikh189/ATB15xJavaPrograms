package Practice;

/*
* static keyword can be used to create a common variable for all the objects of the class
* it is stored in the CMA(Common memory allocation) also callled as Metaspace
* it can be used only for the class variables
* it can be access using className
* it can be access directly using variable name irrespective of method is static or non static
* */
public class J_10_Class_Objects {
    String name;
    int age;
    String city;
    static final int wheels = 4;

    public void car()
    {
        System.out.println(J_10_Class_Objects.wheels);
        System.out.println(wheels);
    }
    public static void main(String[] args) {
J_10_Class_Objects obj = new J_10_Class_Objects();
obj.car();
        System.out.println(J_10_Class_Objects.wheels);
        System.out.println(wheels);
        System.out.println(obj.wheels);

    }
}
