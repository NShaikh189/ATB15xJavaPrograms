package Singleton;

public class SingletonTest {

    public static void main(String[] args) {

        SingletonConcept singletonConceptObj = SingletonConcept.getSingletonConceptObj();
        singletonConceptObj.displayInfo();

        //SingletonConcept singletonConceptObj2 = new SingletonConcept();


        SingleConcept sc = SingleConcept.getObject();
        sc.displayInfo();

        SingleConcept sc1 = SingleConcept.getObject();
        sc1.displayInfo();

    }
}
