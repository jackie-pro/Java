class MotherThread implements Runnable{
	public void run() {
		System.out.println("�����ǳƵN��");
		System.out.println("�����o�{�̰s�Χ��F");
		System.out.println("�����s��l�h�R�̰s");
		Thread son = new Thread(new SonThread());
		son.start();
		System.out.println("��������l��̰s�R�^��");
		try {
			son.join();
		}catch(InterruptedException ie) {
			System.err.println("�o�ͨҥ~!");
			System.out.println("�������_�N��");
			System.exit(1);
		}
		System.out.println("�����}�l�N��");
		System.out.println("�����N�n���F");
	}
}
class SonThread implements Runnable{
	public void run() {
		System.out.println("��l�X���h�R�̰s");
		System.out.println("��l�R�F��Ӧ^��5����");
		try {
			for(int i=1; i<=5; i++) {
				Thread.sleep(1000);
				System.out.println(i+"����");
			}
		}catch (InterruptedException ie) {
			System.err.println("��l�o�ͷN�~");
		}
		System.out.println("\n��l�R�̰s�^�ӤF");
	}
}
public class cooking {

	public static void main(String[] args) {
		Thread mother = new Thread(new MotherThread());
		mother.start();

	}

}
