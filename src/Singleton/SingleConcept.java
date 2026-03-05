package Singleton;

public class SingleConcept {

   // private static SingleConcept sc;

    private SingleConcept()
    {
    }

    public static SingleConcept getObject()
    {
        return new SingleConcept();
    }

    public  void displayInfo()
    {
        System.out.println("SingleConcept ");
    }
}
