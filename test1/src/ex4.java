
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		float input = 0f, anser = 30f;
		
		
		do {
			System.out.print("�п�J�Ʀr:");
			input = scanner.nextFloat();
			if (input > anser)
				System.out.println("�Ӥj�F!");
			else if (input < anser)
				System.out.println("�Ӥp�F");
			} while (input != anser);
		
		System.out.println("���߱z!�q��F!");
		
		scanner.close();
	}

}
