package Singleton;

public class SingletonTest {

    public static void main(String[] args) {

        SingletonConcept sobj = SingletonConcept.getObj();

        SingletonConcept.getObj().display();
    }
}
