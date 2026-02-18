package ENUM;

public class EnumSwitch {

    public static void main(String[] args) {
        Day today = Day.Wednesday;

        switch(today)
        {
            case Wednesday -> System.out.println("Wednesday");
            case Monday -> System.out.println("Monday");
            case Friday -> System.out.println("Friday");

        }

      //  API_URLS url = API_URLS.google;
      //  System.out.println(url); //google
      //  System.out.println(API_URLS.values().toString());
      //  System.out.println(API_URLS.valueOf("fb"));

        String apiurl = API_URLS.GOOGLE.getUrl();
        System.out.println(apiurl);
    }
}
