package Practice;

public class J_19_Inheritance_CarTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        J_19_Inheritance_Car c = new J_19_Inheritance_Car();
        c.start(); //Vehicle Car
        c.stop(); //vehicle
        c.billing(); //vehicle
        c.speed(); //vehicle
        c.engine(); //Car
        c.parking();//Vehicle
        //c.handbrake(); private members cannot be inherited, overrided

        //Parent class referring to the child class object and access the overrided methods
        System.out.println("---Up/Top Casting--");
        J_19_Inheritance_Vehicle cc = new J_19_Inheritance_Car();
        //it will always refer to the parent class methods but
        //if the method is overridden then it will access the child class overridden methods
        cc.start(); // Car
        cc.stop(); // vehicle
        cc.billing(); //vehicle
        cc.speed(); //static method
        //	cc.engine(); // not access car class properties
        cc.parking(); //access final class methods

    }

}
