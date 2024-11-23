import java.util.Scanner;
public class Main{
    public static  void main(String[] args){

    BankAccount bankAccount = new BankAccount();

    double inflow;
    double newInflow;
    double outflow;
    //double updatedBalance=0.0;

    Scanner amount = new Scanner(System.in);
    System.out.println("Please, enter an amount");
    inflow = amount.nextDouble();


    bankAccount.setAccountNumber(2126053467);
    bankAccount.setAccountBalance(inflow);
    bankAccount.setCustomerName("Timson");
    bankAccount.setEmail("timson@gmail.com");
    bankAccount.setPhoneNumber("07012486698");

    System.out.println("Enter amount to deposit");
    newInflow = amount.nextDouble();

    if (newInflow > 0){
        inflow += newInflow;
        bankAccount.setAccountBalance(inflow);
    }




    System.out.println("Your bank details are as follows, account number: "+bankAccount.getAccountNumber());
    System.out.println("account balance: "+bankAccount.getAccountBalance());
    System.out.println("account name: "+bankAccount.getCustomerName());
    System.out.println("email: "+bankAccount.getEmail());
    System.out.println("mobile: "+bankAccount.getPhoneNumber());





    bankAccount.depositFunds(newInflow);


    System.out.println("Enter amount to withdraw:" );
    outflow = amount.nextDouble();

    bankAccount.withDrawFunds(outflow, newInflow);






    }
}