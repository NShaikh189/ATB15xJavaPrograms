package Practice.Abstraction;

public class LoginPageTest {
     static void main() {
          int a=10, b=6; int c = a+b*5;
          System.out.println(c);

          float x = 22.54F;
          float y = 23.5F;

          if(true == true)
              System.out.println("True");
          else
              System.out.println("False");

        LoginPage loginPage = new LoginPage();
        loginPage.title();
        loginPage.url();
        loginPage.displayLogo();
        loginPage.footers();
        LoginPage.pageAuthor();
       // int speed = loginPage.min_speed;

       Page page = new LoginPage(1000);
        page.title();
        page.url();
        page.displayLogo();
        page.footers();
        Page.pageAuthor();
      //  Page p = new Page() ; //abstract object cannot be created
    }
}
