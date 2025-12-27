package Practice.Interface;

public class FortisHospital extends Hospital implements USMedical,UKMedical, IndianMedical{

    @Override
    public void gynecServices() {
        System.out.println("FH - gynecServices");
    }

    @Override
    public void radiologyServices() {
        System.out.println("FH - radiologyServices");

    }

    @Override
    public void cardioServices() {
        System.out.println("FH - cardioServices");

    }

    @Override
    public void dentalServices() {
        System.out.println("FH - dentalServices");

    }

    @Override
    public void physioServices() {
        System.out.println("FH - physioServices");

    }

    @Override
    public void oncologyServices() {
        System.out.println("FH - oncologyServices");

    }

    @Override
    public void pediaServices() {
        System.out.println("FH - pediaServices");

    }

    @Override
    public void emergencyServices() {
        System.out.println("FH - emergencyServices");
    }

    //FH-Individual Methods
    public void OPTServices()
    {
        System.out.println("FH - OPTServices");

    }

    public void pathologyServices()
    {        System.out.println("FH - pathologyServices");
    }
}
