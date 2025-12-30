package Practice.Abstraction;

public class LoginPageTest {
     static void main() {
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
