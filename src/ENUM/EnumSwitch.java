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
    }
}
