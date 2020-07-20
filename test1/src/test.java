class HelloThread extends Thread{
	String name;
	public HelloThread(String n) {
		name = n;
	}
	public void run() {
		for (int i =1; i<100; i++) {
			System.out.println(name+"Hello"+i);
		}
	}
}

class HelloRunner implements Runnable{
	String name;
	public HelloRunner(String n) {
		name = n;
	}
	public void run() {
		for (int i =1; i<100; i++) {
			System.out.println(name+"Hello"+i);
		}
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new HelloThread("Thread1");
		
		Runnable r2 = new HelloRunner("Thread2");
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();

	}

}
