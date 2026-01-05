package ex_07_StaticConcept;
/*
Can we use this keyword in static method?
this keyword refers to the current class objects
static variables are at the class levels
 */
public class Lab_013_ThisStatic {
    int x=10;
    static int wheels = 4;

    public void getDetails()
    {
        System.out.println(this.x);
    }

    public static void getInfo()
    {
        //System.out.println(this.wheels); //not allowed
        //       System.out.println(this.x); non-static variable this cannot be referenced from a static context
     }

    public static void main() {

        Lab_013_ThisStatic obj = new Lab_013_ThisStatic();
        obj.getDetails();
            }
}
