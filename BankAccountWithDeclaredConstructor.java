public class BankAccountWithDeclaredConstructor {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccountWithDeclaredConstructor(){
        this(2345637, 26000, "Timozino", "timozino@gmail.com",
                "09012345678");

        System.out.println("calling constructor with args within constructor with no args");
    }

    public BankAccountWithDeclaredConstructor(int accountNumber, double accountBalance, String customerName,
                                              String email, String phoneNumber){
        System.out.println("Constructor with args is called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email =email;
        this.phoneNumber = phoneNumber;
    }

    //getters
    public long getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance(){
        return  accountBalance;

    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void depositFunds(double funds){

        System.out.println("Credit Alert");
        System.out.println("You have received an inflow of "+funds + " and your balance is: "+(accountBalance));
    }

    public void withDrawFunds(double withdrawal, double funds){
        if (accountBalance == 0 || accountBalance < 0 || accountBalance<withdrawal){
            System.out.println("Insufficient funds, balance is: "+(accountBalance));
        }else{
            System.out.println("Transaction successful!!! Your balance is: "+(accountBalance-withdrawal));
        }
    }

}
