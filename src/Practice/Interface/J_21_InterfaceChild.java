package Practice.Interface;

/*
- Interface is used to achieve multiple inheritance
- Cannot create the object of the Parent class
- Parent class of interface should be interface only
- Class variables are by default static and final
- all methods are abstract by default
- method declaration is only allowed and defined in the implemented classes
- From java 1.8, static and default methods can be defined

 */
public interface J_21_InterfaceChild extends J_21_InterfaceParent {
int max_speed = 100;

public void start();

public void stop();

public static void billing()
{
    System.out.println("Interface - billing static method");
}

default void parking()
{
    System.out.println("Interface - parking default method");
}
}
