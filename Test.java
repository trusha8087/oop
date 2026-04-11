//Define a base class BankAccount with common attributes like accountNumber, 
//accountHolderName, and balance. Then, define two subclasses: SavingAccount and 
//FixedDepositAccount, which inherit from BankAccount. Implement basic operations like 
//openAccount(), deposit(), checkBalance(), and withdraw() in BankAccount. The 
//SavingAccount should include a calculateInterest() method specific to savings accounts, 
//and FixedDepositAccount should have a maturityAmount() method considering fixed 
//deposit terms.

class BankAccount{
	int accountNumber;
	String accountHolderName;
        double balance;

	void openAccount(int number, String Name, double bal){
		accountNumber = number;
		accountHolderName = Name;
		balance = bal;
	}
	void deposit(double amount){
		balance = balance + amount;
	}
	void checkBalance(){
		System.out.println("balance=" + balance);
	}
	void withdraw(double amount){
		balance = balance - amount;
	}
}
class SavingAccount extends BankAccount{
	void calculateInterest(){
		double Interest = (balance*3)/100;
		System.out.println("Interest" + Interest);
	}
}
class FixedDepositAccount extends BankAccount{
	void maturityAmount(){
		double maturityamount = (balance*7*2)/100;
		System.out.println("maturityamount after 2 year of 7% of interestrate=" + maturityamount);
		                                                       	
	}
}class Test{
	public static void main(String []args){
		SavingAccount s=new SavingAccount();
		FixedDepositAccount f=new FixedDepositAccount();
		s.openAccount(1,"trusha",100);
		s.deposit(5);
		s.checkBalance();
		s.withdraw(2);
		s.calculateInterest();

		System.out.println("---------------------------------------");
		f.openAccount(2,"krisha",50);
		f.maturityAmount();
		
}

}








