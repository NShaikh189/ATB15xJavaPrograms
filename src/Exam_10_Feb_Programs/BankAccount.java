package Exam_10_Feb_Programs;

public class BankAccount {
    private  double balance;

    public void deposit(double amount)
    {

        if(amount<=0)
        {
            System.out.println("Deposit amount should be greater than zero: "+amount);
            return;
        }
        System.out.println("Deposit Amount: "+amount);

            balance = balance + amount;
            System.out.println("Balance after deposit: "+getBalance());

    }

    public void withdraw(double amount)
    {

        if(amount<=0)
        {
            System.out.println("Withdrawal amount should be greater than zero: "+amount);
            return;
        }

        System.out.println("Withdraw Amount: "+amount);

        if(amount>balance) {
            System.out.println("Insufficient Balance");
        }
        else{
             balance = balance - amount;
            System.out.println("Balance after withdrawal : "+getBalance());
        }


    }

    public double getBalance()
    {
       return balance;
    }


    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
       //Initial balance check
        System.out.println("Balance: "+b1.getBalance());

        //Edge case - deposit 0 amount validation
        b1.deposit(0);

        //Edge case - withdraw 0 amount validation
        b1.withdraw(0);

        //Edge case - deposit 0 amount validation
        b1.deposit(500);

        //Edge case - deposit -100 amount validation
        b1.deposit(-100);

        //Edge case - deposit 0 amount validation
        b1.withdraw(500);

        System.out.println("Balance: "+b1.getBalance());





    }
}
