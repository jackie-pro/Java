class MotherThread implements Runnable{
	public void run() {
		System.out.println("媽媽準備煮飯");
		System.out.println("媽媽發現米酒用完了");
		System.out.println("媽媽叫兒子去買米酒");
		Thread son = new Thread(new SonThread());
		son.start();
		System.out.println("媽媽等兒子把米酒買回來");
		try {
			son.join();
		}catch(InterruptedException ie) {
			System.err.println("發生例外!");
			System.out.println("媽媽中斷煮飯");
			System.exit(1);
		}
		System.out.println("媽媽開始煮飯");
		System.out.println("媽媽煮好飯了");
	}
}
class SonThread implements Runnable{
	public void run() {
		System.out.println("兒子出門去買米酒");
		System.out.println("兒子買東西來回需5分鐘");
		try {
			for(int i=1; i<=5; i++) {
				Thread.sleep(1000);
				System.out.println(i+"分鐘");
			}
		}catch (InterruptedException ie) {
			System.err.println("兒子發生意外");
		}
		System.out.println("\n兒子買米酒回來了");
	}
}
public class cooking {

	public static void main(String[] args) {
		Thread mother = new Thread(new MotherThread());
		mother.start();

	}

}
