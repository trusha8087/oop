class BankAccount1{ 
    String account_holder_name; 
    double balance; 
    static double interest_rate; 
    void assignValues(String name, double bal){ 
        account_holder_name = name; 
        balance = bal; 
    } 
    void interestEarned(){ 
        double interest = balance * interest_rate / 100; 
    } 
    void displayValues(){ 
        System.out.println("Account Holder Name: " + account_holder_name); 
        System.out.println("Balance: " + balance); 
        System.out.println("Interest Rate: " + interest_rate + "%"); 
        System.out.println("----------------------"); 
    } 
    static void updateIntrestRate(double newRate){ 
        interest_rate = newRate; 
    } 
    public static void main(String[] args){ 
        System.out.println("Trusha - 240390107034"); 
        BankAccount1.updateIntrestRate(5.0); 
        BankAccount1 account1 = new BankAccount1(); 
        account1.assignValues("Trusha", 10000); 
        account1.displayValues(); 
 
        BankAccount1 account2 = new BankAccount1(); 
        account2.assignValues("Mitul", 20000); 
        account2.displayValues(); 
 
        BankAccount1.updateIntrestRate(6.0); 
        System.out.println("Updated Interest Rate to 6.0%\n"); 
 
        account1.displayValues(); 
        account2.displayValues(); 
    } 
}