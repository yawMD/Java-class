package bank;

public class Bankaccount {
	private double accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Bankaccount(double accountNumber, double balance, String accountHolderName) {
		this.accountNumber = accountNumber;
    	this.balance = balance;
    	this.accountHolderName = accountHolderName;
	}
	
    public void deposit(double amount) {
    	this.balance = balance + amount;   	
    }
    
    public String  withdrawall(double amount) {
    	if ((balance - amount) >= 0) {
    		
            this.balance = balance - amount;
        	
        	return "minimum balance left =" + balance;
    	
    	} else {
    		return "you do not have enough money in your bank account";
    	}
    }
    
    public double getBalance() {
        return balance;
    }
    
}
