package Singleton;

public class SingletonConcept {
    private static SingletonConcept obj;

    private SingletonConcept(){}

    public static SingletonConcept getObj()
    {
        return new SingletonConcept();
    }

    public void display()
    {
        System.out.println("Display called");
    }
}
