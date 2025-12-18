package Practice;

/*
* Only Class variables can be static
* static variables are stored in the CMA (Metaspace)
* static variables can be accessed directly or by using className
* static variables share a common value to all the class objects
* */
public class J_15_StaticVariable
{
    String name = "John";
    static int age = 10;

    public static void sm()
    {
        System.out.println("J_15_StaticVariable has static method");
    }
    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(J_15_StaticVariable.age);
        //System.out.println(name); //java: non-static variable name cannot be referenced from a static context
        J_15_StaticVariable obj = new J_15_StaticVariable();
        System.out.println(obj.age); //Static member 'Practice.J_15_StaticVariable.age' accessed via instance reference

        System.out.println(obj.name);
    }
}
