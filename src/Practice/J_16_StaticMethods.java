package Practice;

/*
1. Static methods can be called directly within the same class
2. static methods can be called using class name outside the class
2. Static methods are saved in the CMA
3. Non static methods can be called only using the class objects
4. static methods can be overloaded

 */
public class J_16_StaticMethods {

    public static void m1()
    {
        System.out.println("m1");
    }
    public static void m2()
    {
        System.out.println("m2");
       // t1(); //java: non-static method t1() cannot be referenced from a static context
        J_16_StaticMethods obj1 = new J_16_StaticMethods();
        obj1.t1();
    }

    public void t1()
    {
        System.out.println("t1");
        m1(); // static method called directly from Non Static method
    }

    public static void main(String[] args) {
        System.out.println(J_15_StaticVariable.age);
        m1();
        m2();
        J_16_StaticMethods obj1 = new J_16_StaticMethods();
        obj1.t1();
    }
}
