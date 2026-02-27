package SDETPrep90Days.Day4;
//abstract class may have or may not have abstract methods
//we cannot create the object of the abstract class using new
//Example: We create bank a/c at the branch e.g. HDFC wakad, SBI Pimpri, SBI wakad

public abstract class Bank   {

    public static final String BANK_NAME = "HDFC Bank";

    public Bank(String branchName)
    {
        System.out.println("Welcome to "+BANK_NAME+", "+branchName);
    }
    public void createAccount(String document)
    {
        System.out.println("creating account with the document ..."+document);
        if(validateDocument(document))
            System.out.println("Bank account created successfully");
        else
            System.out.println("Invalid document");
    }


    public abstract boolean validateDocument(String document);
}
