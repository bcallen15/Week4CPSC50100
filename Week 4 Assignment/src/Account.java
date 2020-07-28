
public class Account {
	static int numAccounts = 0;
	Account() {
		numAccounts += 1;
	}

	public static void main(String[] args) {
		Account num1 = new Account();
		Account num2 = new Account();
		Account num3 = new Account();
		Account num4 = new Account();
		Account num5 = new Account();
		System.out.println("Number of accounts: " + getnumAccounts());

	}
	public static int getnumAccounts() {
		return numAccounts;
	}
}
