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

        System.out.println("-----");

    }

}
