class ext{		
       public int ex(int a,int b) {
					System.out.println("���� a + b");
					return a + b;
				}
		public int ex(int a,int b,int c) {
					System.out.println("���� a - b - c");
					return a - b - c;
				}
		public int ex(int a,int b,int c,int d) {
					System.out.println("���� a * b * c * d");
					return a * b * c * d;
				}
}

public class ex8 {
	
	public static void main(String[] args) {
		
		ext ext1 = new ext();

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("�п�ܭn��J�X�Ӿ��:");
		System.out.println("1.2�Ӿ��  2.3�Ӿ��  3.4�Ӿ�� ");
		int input = scanner.nextInt();
		switch(input) {
		case 1:
			System.out.println("�п�J��1�Ӿ��:");
			int x1 = scanner.nextInt();
		    System.out.println("�п�J��2�Ӿ��:");
			int x2 = scanner.nextInt();
			int ans1 = ext1.ex(x1,x2);
			System.out.println("����:"+ans1);
				break;
		case 2:
			System.out.println("�п�J��1�Ӿ��:");
			int y1 = scanner.nextInt();
		    System.out.println("�п�J��2�Ӿ��:");
			int y2 = scanner.nextInt();
		    System.out.println("�п�J��3�Ӿ��:");
			int y3 = scanner.nextInt();
			int ans2 = ext1.ex(y1,y2,y3);
			System.out.println("����:"+ans2);
				break;
		case 3:
			System.out.println("�п�J��1�Ӿ��:");
			int z1 = scanner.nextInt();
		    System.out.println("�п�J��2�Ӿ��:");
			int z2 = scanner.nextInt();
		    System.out.println("�п�J��3�Ӿ��:");
			int z3 = scanner.nextInt();
		    System.out.println("�п�J��4�Ӿ��:");
			int z4 = scanner.nextInt();
			int ans3 = ext1.ex(z1,z2,z3,z4);
			System.out.println("����:"+ans3);
				break;
		

	}
		scanner.close();
}
}




