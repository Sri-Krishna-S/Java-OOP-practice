public class BankMain{
    public static void main(String[] args){
        BankAccount.displayBankInfo();
        BankAccount acc1=new BankAccount("ACC123",1000.0);
        acc1.deposit(500.0);
        System.out.println("Balance in account is : "+acc1.getbalance());
    }
}