package Practice.Inheritance;

public class ChildClass extends ParentClass{
    public ChildClass()
    {
        super("Don");
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
    }
}
