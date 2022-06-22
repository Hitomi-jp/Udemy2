public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default name", 500000.00, "aiueo@gmail.com" );

    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "nanashi@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
    }
}
