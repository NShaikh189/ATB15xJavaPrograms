package Practice;
/*
- private constructors can be accessed withing the class itself
- private constructors cannot be accessed from outside class - J_18_PrivateConstructorTest class
 */
public class J_18_PrivateConstructor {

    private J_18_PrivateConstructor()
    {
        System.out.println("Private constructor");
    }

    public static void main() {
        J_18_PrivateConstructor obj1 = new J_18_PrivateConstructor();


    }
}
