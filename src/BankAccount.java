public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Depost of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount){
        if(this.balance - withdrawAmount < 0){
            System.out.println("only " + this.balance + " availabel. Withdrawal not processed.");
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + " processed. Rmaining balance = " + this.balance);
        }

    }



    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        BankAccount hitomisAccount = new BankAccount();
        hitomisAccount.withdraw(100.0);

        hitomisAccount.deposit(50.0);
        hitomisAccount.withdraw(100.0);

        hitomisAccount.deposit(51.0);
        hitomisAccount.withdraw(100.0);
    }

}
