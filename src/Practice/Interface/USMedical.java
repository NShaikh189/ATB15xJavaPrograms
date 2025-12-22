package Practice.Interface;
//no method body
//only mehtod prototype
//only method declaration
//abstract keyword is not mandatory

public interface USMedical {

    //variables are static and final by default
    int min_fee = 100;
    public void physioServices();

    public void oncologyServices();

    public void pediaServices();

    public  void emergencyServices();

    public static void billing()
    {
        System.out.println("US Medical - Billing");
    }

    public default void medicalInsurance()
    {
        System.out.println("USMedical - Medical Insurance");
    }
}
