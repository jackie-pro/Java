
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		float input = 0f, anser = 30f;
		
		
		do {
			System.out.print("請輸入數字:");
			input = scanner.nextFloat();
			if (input > anser)
				System.out.println("太大了!");
			else if (input < anser)
				System.out.println("太小了");
			} while (input != anser);
		
		System.out.println("恭喜您!猜對了!");
		
		scanner.close();
	}

}
