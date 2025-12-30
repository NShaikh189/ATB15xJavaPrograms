package Practice.Abstraction;

public class LoginPageTest {
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.title();
        loginPage.url();
        loginPage.displayLogo();
        loginPage.footers();

       Page page = new LoginPage(1000);
        page.title();
        page.url();
        page.displayLogo();
        page.footers();
    }
}
