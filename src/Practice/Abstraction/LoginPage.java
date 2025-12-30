package Practice.Abstraction;

public class LoginPage extends Page{

    public LoginPage()
    {
       // super(500);
        this(500);
        System.out.println("Login Page - default constructor");
    }

    public LoginPage(int x)
    {
        System.out.println("Login Page - constructor : "+x);
    }
}
