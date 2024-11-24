import java.util.Scanner;
public class Main{
    public static  void main(String[] args){

    double inflow;
    double newInflow;
    double outflow;
    Scanner amount = new Scanner(System.in);
    System.out.println("Please, enter an amount");
    inflow = amount.nextDouble();
    System.out.println("Your Opening Balance is: "+inflow);
    System.out.println("Enter amount to deposit");
    newInflow = amount.nextDouble();



    if (newInflow > 0){
        inflow += newInflow;

    }

    BankAccountWithDeclaredConstructor bankAccount = new BankAccountWithDeclaredConstructor();
    //BankAccountWithDeclaredConstructor bankAccount = new BankAccountWithDeclaredConstructor(2126053467,inflow,
     //      "Timson", "timson@gmail.com", "07012486698");

    bankAccount.depositFunds(inflow);

    System.out.println("Enter amount to withdraw:" );
    outflow = amount.nextDouble();

    bankAccount.withDrawFunds(outflow, newInflow);



    amount.nextDouble();







    System.out.println("Your bank details are as follows, account number: "+bankAccount.getAccountNumber());
    System.out.println("account balance: "+bankAccount.getAccountBalance());
    System.out.println("account name: "+bankAccount.getCustomerName());
    System.out.println("email: "+bankAccount.getEmail());
    System.out.println("mobile: "+bankAccount.getPhoneNumber());



















    SimpleCalculator calculator = new SimpleCalculator();

    double firstNum;
    double secondNum;

    Scanner calcNum = new Scanner(System.in);
    System.out.println("Enter First Num");
    firstNum = calcNum.nextDouble();
    System.out.println("Enter Second Num");
    secondNum = calcNum.nextDouble();

    calculator.setFirstNumber(firstNum);
    calculator.setSecondNumber(secondNum);

    System.out.println("Addition = "+ calculator.getAdditionResult());
    System.out.println("Subtraction = "+ calculator.getSubtractionResult());
    System.out.println("multiplication = "+ calculator.getMultiplicationResult());
    System.out.println("division = "+ calculator.getDivisionResult());


    calcNum.nextDouble();






   /* BankAccount bankAccount = new BankAccount();

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

    bankAccount.withDrawFunds(outflow, newInflow); */








    }
}