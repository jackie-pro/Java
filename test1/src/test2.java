
public class test2 {
	private int balance;
	public test2(int initBal) {
		balance = initBal;
	}

	public synchronized void deposit(int amt) {
		int b = balance;
		for(int i=0; i<10000000; i++);
		b += amt;
		balance = b;
	}
	public synchronized void withdraw(int amt) {
		int b = balance;
		for(int i=0; i<10000000; i++);
		b -= amt;
		balance = b;

}
	public int getBalance() {
		return balance;
	}
}
