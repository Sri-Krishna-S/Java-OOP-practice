public class BankAccount{
    //field or state of the class BankAccount (field encapsulation)
    private String accountnumber;
    private double balance;
    public static final String BANK_NAME ="SBIbank";
    public BankAccount(String accountnumber, double initialbalance){
        this.accountnumber=accountnumber;
        this.balance=initialbalance;
    }
    public void deposit(double amount){
        if (amount>0)balance+=amount;
    }
    public double getbalance(){
        return balance;
    }
    public static void displayBankInfo(){
        System.out.println("Welcome to "+BANK_NAME);
    }
}
