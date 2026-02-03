package ENUM;


public class EnumConcept {

    public static void main(String[] args) {
        Day today = Day.Monday;

        System.out.println(today);
        System.out.println(Day.Friday);
        System.out.println(today.name()); // Monday
        System.out.println(today.ordinal()); //1
        today = Day.Saturday;
        System.out.println(today.ordinal());//6

    }
}
