class XXX extends Thread{
	String name;
	public XXX(String n) {
		name = n;
	}
	
	public void run() {
			for (int i=1; i<=30; i+=2) {
			System.out.println(name+"="+i+",");
			
		}
	}
}

class YYY extends Thread{
	String name;
	public YYY(String n) {
		name = n;
	}
	public void run() {
			
			for (int i=1; i<=30; i*=3) {
				System.out.println(name+"="+i+",");
		}
	}
}

class ZZZ extends Thread{
	String name;
	public ZZZ(String n) {
		name = n;
	}
	public void run() {
		for (int i=1; i<=30; i+=5) {
			System.out.println(name+"="+i+",");
			
		}
	}
}


public class ex17 {

	public static void main(String[] args) {
		Thread X1 = new XXX("X");
		Thread Y1 = new YYY("Y");
		Thread Z1 = new ZZZ("Z");

		try {
			Z1.start();
			Z1.join();
			Y1.start();
			Y1.join();
			X1.start();
			X1.join();
		}catch(Exception e) {
		
		}
	
	}
}


