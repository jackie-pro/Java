class ext{		
       public int ex(int a,int b) {
					System.out.println("執行 a + b");
					return a + b;
				}
		public int ex(int a,int b,int c) {
					System.out.println("執行 a - b - c");
					return a - b - c;
				}
		public int ex(int a,int b,int c,int d) {
					System.out.println("執行 a * b * c * d");
					return a * b * c * d;
				}
}

public class ex8 {
	
	public static void main(String[] args) {
		
		ext ext1 = new ext();

		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("請選擇要輸入幾個整數:");
		System.out.println("1.2個整數  2.3個整數  3.4個整數 ");
		int input = scanner.nextInt();
		switch(input) {
		case 1:
			System.out.println("請輸入第1個整數:");
			int x1 = scanner.nextInt();
		    System.out.println("請輸入第2個整數:");
			int x2 = scanner.nextInt();
			int ans1 = ext1.ex(x1,x2);
			System.out.println("等於:"+ans1);
				break;
		case 2:
			System.out.println("請輸入第1個整數:");
			int y1 = scanner.nextInt();
		    System.out.println("請輸入第2個整數:");
			int y2 = scanner.nextInt();
		    System.out.println("請輸入第3個整數:");
			int y3 = scanner.nextInt();
			int ans2 = ext1.ex(y1,y2,y3);
			System.out.println("等於:"+ans2);
				break;
		case 3:
			System.out.println("請輸入第1個整數:");
			int z1 = scanner.nextInt();
		    System.out.println("請輸入第2個整數:");
			int z2 = scanner.nextInt();
		    System.out.println("請輸入第3個整數:");
			int z3 = scanner.nextInt();
		    System.out.println("請輸入第4個整數:");
			int z4 = scanner.nextInt();
			int ans3 = ext1.ex(z1,z2,z3,z4);
			System.out.println("等於:"+ans3);
				break;
		

	}
		scanner.close();
}
}




