package Singleton;

public class SingletonTest {

    public static void main(String[] args) {

        SingletonConcept singletonConceptObj = SingletonConcept.getSingletonConceptObj();

        singletonConceptObj.displayInfo();
    }
}
