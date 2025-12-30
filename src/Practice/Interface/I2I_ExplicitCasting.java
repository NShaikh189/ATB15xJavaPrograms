package Practice.Interface;

public class I2I_ExplicitCasting {

    public static void main(String[] args) {
        //WedDriver driver = new ChromeDriver();
        //JavaScriptExecutor js = (JavaScriptExecutor) driver;

        //Sibling interface classes
        USMedical us = new FortisHospital();
         UKMedical uk1 = new FortisHospital();
        us.medicalInsurance();
        us.emergencyServices();
        us.pediaServices();
        us.physioServices();
        us.oncologyServices();

        /*Interface to Interface explicit casting
        - we cannot create object of Interface,
        but we can create a reference variable to another interface reference variable using explicit casting.
        Below, we are creating a UKMedical referene variable pointing to the USMedical reference variable us.

        * */
        UKMedical uk = (UKMedical) us;
        uk.cardioServices();
        uk.dentalServices();
        uk.emergencyServices();

        uk1.cardioServices();
        uk1.dentalServices();
        uk1.emergencyServices();

    }
}
