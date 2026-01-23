package OOPs;

import Practice.Abstraction.LoginPage;

public class Lab017_LoginPage extends BasePage{
    String username;

    public Lab017_LoginPage(String username, String password, String submitButton) {

        System.out.println("hello");
        this.username = username;
        this.password = password;
        this.submitButton = submitButton;


    }

    String password;
    String submitButton;

    public Lab017_LoginPage()
    {
        System.out.println("Default COnstructor");
        this("Operator","YYY","Yes");



    }

    public static void main(String[] args) {
        Lab017_LoginPage lp = new Lab017_LoginPage("Admin","XXX","submit");
        System.out.println(lp.username);
        System.out.println(lp.password);
        System.out.println(lp.submitButton);
    }
}
