package SDETPrep90Days.Day4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Runner {


    void main() throws InterruptedException {

        Bank hb_wakad = new HDFCWakad();
        hb_wakad.createAccount("Electricity Bill");


        Bank hb_pune= new HDFCPune();
        hb_pune.createAccount("Property tax Bill");

        //Bank hdfcbank3= new Bank();
        hb_pune.createAccount("Passport");
    }
}
