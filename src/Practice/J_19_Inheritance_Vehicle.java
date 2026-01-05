package Practice;

public class J_19_Inheritance_Vehicle {
    int wheels = 4;
    public void start(){
        System.out.println("Vehicle : start");
    }

    public void stop(){
        System.out.println("Vehicle : stop");
    }

    public void billing(){
        System.out.println("Vehicle : billing");
    }

    private void handbrake(){
        System.out.println("Vehicle Final : handbrake");
    }

    public static void speed()
    {
        System.out.println("Vehicle : Speed");
    }

    public final void parking()
    {
        System.out.println("Vehicle : parking");
    }
}
