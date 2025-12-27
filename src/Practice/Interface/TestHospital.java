package Practice.Interface;

public class TestHospital {
    public static void main() {
        FortisHospital fh = new FortisHospital();

        fh.cardioServices();
        fh.dentalServices();
        fh.pediaServices();
        fh.pathologyServices();
        fh.OPTServices();
        fh.gynecServices();

        //cannot create object of interface
        //UKMedical uk = new UKMedical() ;
        System.out.println("Top Casting");
        //TopCasting
        //child class object referred by parent class ref. variable
        USMedical us = new FortisHospital();
        us.oncologyServices();
        us.physioServices();
        us.pediaServices();
        us.emergencyServices();
        //Grand parent cannot take anything from children - cannot access child individual methods
        //grand parent can access only the overridden methods in the child class

        //downcasting not allowed with the interfaces

        UKMedical uk = new FortisHospital();
        uk.cardioServices();
        uk.dentalServices();
        uk.emergencyServices();

        //Static methods
        USMedical.billing();
        us.medicalInsurance();
       // USMedical.min_fee = 500;
        System.out.println("Minimum fees for USM : "+USMedical.min_fee);

        FortisHospital fh1 = new FortisHospital();
        fh1.registration();
        fh1.insurer();
    }
}
