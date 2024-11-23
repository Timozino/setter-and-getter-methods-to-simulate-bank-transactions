
public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

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

    //setters
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance =accountBalance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String mobile){
        phoneNumber = mobile;
    }

    public void depositFunds(double funds){

        System.out.println("Credit Alert");
        System.out.println("You have received an inflow of "+funds + " and your balance is: "+(accountBalance+funds));
    }

    public void withDrawFunds(double withdrawal, double funds){
        if (accountBalance == 0 || accountBalance < 0 || accountBalance<withdrawal){
            System.out.println("Insufficient funds, balance is: "+(accountBalance + funds));
        }else{
            System.out.println("Transaction successful!!! Your balance is: "+(accountBalance-withdrawal));
        }
    }
}
