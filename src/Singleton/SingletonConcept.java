package Singleton;

public class SingletonConcept {
//only one instance should be created
//constructor is private - Not allowing to create a object outside class
//private reference variable and static so that only one instance can be used everywhere

    private static SingletonConcept singletonConceptObj;

    private SingletonConcept()
    {}

    public static SingletonConcept getSingletonConceptObj() {
        return singletonConceptObj = new SingletonConcept();
    }


    public void displayInfo()
    {
        System.out.println("Singleton class display method");
    }
}
