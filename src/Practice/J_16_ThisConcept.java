package Practice;

/*
this() is used to call the current class constructor
can be used only inside the constructor
used for constructor chaining - this(), this(10) etc
It should be the first statement in the constructor

this keyword
scope is limited to the current class
refers to the current class object
Used in the builder pattern to return the current class object
access instance variables
 */

public class J_16_ThisConcept {

    String name;
    static byte wheels=4;
    String model;
    J_16_ThisConcept()
    {
        this.name = "Maruti";
        this.model = "Swift";
     //  this("Hyundai","Creta");
    }

    J_16_ThisConcept(String name, String model)
    {
        this.name = name;
        this.model = model;
            //this();
    }

    public void m1()
    {
      //  this(); //Error: java: explicit constructor invocation may only appear within a constructor body
    }

     static void main() {
        J_16_ThisConcept obj1 = new J_16_ThisConcept();
        System.out.println(obj1.name+" : "+obj1.model+" : "+wheels);

        J_16_ThisConcept obj2 = new J_16_ThisConcept("Hyndai","Creata");
        System.out.println(obj2.name+" : "+obj2.model+" : "+wheels);

        obj2.m1();
    }
}
