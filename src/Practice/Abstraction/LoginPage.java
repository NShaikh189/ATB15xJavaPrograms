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

    @Override
    public void title() {
        System.out.println("Login Page - Title");
    }

    @Override
    public void url() {
        System.out.println("Login Page - url"+super.min_speed);
        super.displayLogo();

    }
}
