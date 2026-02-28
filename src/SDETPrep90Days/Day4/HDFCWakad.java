package SDETPrep90Days.Day4;

public class HDFCWakad extends Bank{

    public HDFCWakad()
    {
        super("Wakad");
    }

    @Override
    public boolean validateDocument(String document) {
        if(document.equalsIgnoreCase("Electricity Bill") || document.equalsIgnoreCase("Adhar Card"))
            return true;
        else
            return false;
    }
}
