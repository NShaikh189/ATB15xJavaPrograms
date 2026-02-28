package SDETPrep90Days.Day4;

public class Runner {


    void main() {

        Bank hb_wakad = new HDFCWakad();
        hb_wakad.createAccount("Electricity Bill");


        Bank hb_pune= new HDFCPune();
        hb_pune.createAccount("Property tax Bill");

        //Bank hdfcbank3= new Bank();
        hb_pune.createAccount("Passport");
    }
}
