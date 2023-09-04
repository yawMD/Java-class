package bank;

public class App {
	public static void main(String []args) {
		Bankaccount bank = new Bankaccount(011,0, "Emmanuel");
		bank.deposit(0);
		String balance = bank.withdrawall(30);
		
		System.out.println(balance);
	}
}
