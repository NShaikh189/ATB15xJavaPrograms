package SDETPrep90Days.Day4;

public class HDFCPune extends Bank{

    public HDFCPune()
    {
        super("Pune");
    }
    @Override
    public boolean validateDocument(String document) {
       if(document.equalsIgnoreCase("Passport"))
           return true;
       else
        return false;
    }
}
