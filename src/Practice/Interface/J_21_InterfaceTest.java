package Practice.Interface;

import Practice.J_19_Inheritance_Car;

public class J_21_InterfaceTest implements J_21_InterfaceChild {

    //Parent property
    @Override
    public void start() {
        System.out.println("Test - start");
    }

    //Parent Property
    @Override
    public void stop(){
        System.out.println("Test - stop");
    }

    //GrandParent property
    @Override
    public void emergencyServices() {
        System.out.println("Test - emergency services");
    }

    public static void main() {
        J_21_InterfaceTest obj1 = new J_21_InterfaceTest();

        obj1.parking();
        J_21_InterfaceChild.billing();
        obj1.start();
        obj1.start();
        obj1.emergencyServices();


       // J_21_InterfaceChild obj2 = new J_21_InterfaceChild() ;
       // J_21_InterfaceParent obj2 = new J_21_InterfaceParent();

        J_21_InterfaceChild obj2 = new J_21_InterfaceTest();
        obj2.parking();
        obj2.start();
        obj2.stop();
        obj2.emergencyServices();

    }
}
