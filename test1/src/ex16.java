//A�~��
class AAA extends Thread{
	String name;
	public AAA(String n) {
		name = n;
	}
	public void run() {
		for (int i =0; i<=100; i+=1) {
			System.out.print(name+"="+i+",");//���q������Ǧ����|�P�ɨæC�L�b�P�@��
			System.out.println();//���q������Ǧ����|�P�ɨæC�L�b�P�@��
		}
	}
}
//B�~��
class BBB extends Thread{
	String name;
	public BBB(String n) {
		name = n;
	}
	public void run() {
		for (int i =0; i<=100; i+=2) {
			System.out.print(name+"="+i+",");//���q������Ǧ����|�P�ɨæC�L�b�P�@��
			System.out.println();//���q������Ǧ����|�P�ɨæC�L�b�P�@��
		}
	}
}
//C��@
class CCC implements Runnable{
	String name;
	public CCC(String n) {
		name = n;
	}
	public void run() {
		for (int i =0; i<=100; i+=3) {
			System.out.print(name+"="+i+",");//���q������Ǧ����|�P�ɨæC�L�b�P�@��
			System.out.println();//���q������Ǧ����|�P�ɨæC�L�b�P�@��
		}
	}
}
//D��@
class DDD implements Runnable{
	String name;
	public DDD(String n) {
		name = n;
	}
	public void run() {
		for (int i =0; i<=100; i+=4) {
			System.out.print(name+"="+i+",");//���q������Ǧ����|�P�ɨæC�L�b�P�@��
			System.out.println();//���q������Ǧ����|�P�ɨæC�L�b�P�@��
		}
	}
}
//E��@
class EEE implements Runnable{
	String name;
	public EEE(String n) {
		name = n;
	}
	public void run() {
		for (int i =0; i<=100; i+=5) {
			System.out.print(name+"="+i+",");//���q������Ǧ����|�P�ɨæC�L�b�P�@��
			System.out.println(); //���q������Ǧ����|�P�ɨæC�L�b�P�@��
		}
	}
}
public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread A1 = new AAA("A");
		Thread B1 = new BBB("B");
		
		Runnable r1 = new CCC("C");
		Thread C1 = new Thread(r1);
		
		Runnable r2 = new DDD("D");
		Thread D1 = new Thread(r2);
		
		Runnable r3 = new EEE("E");
		Thread E1 = new Thread(r3);
		
		A1.start();
		B1.start();
		C1.start();
		D1.start();
		E1.start();
	}

}
