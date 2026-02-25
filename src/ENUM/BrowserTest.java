package ENUM;

import org.w3c.dom.ls.LSOutput;

public class BrowserTest {

    public static void main(String[] args) {
        Browser browser = Browser.FIREFOX;

        switch(browser)
        {
            case FIREFOX:
                System.out.println(browser.name());
                break;

            case CHROME:
                System.out.println(browser.name());
                break;
        }

        String googleUrl = API_URLS.GOOGLE.getUrl();
        System.out.println(googleUrl);
    }

}
