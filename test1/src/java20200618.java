
public class java20200618 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("輸入整數:");
		int input1 = scanner.nextInt();

		if (input1 % 2 == 0)
			System.out.println(input1 + "是偶數");
		if (input1 % 2 != 0)
			System.out.println(input1 + "是奇數");
		int x = (input1 / 10);

		switch (x) {
		case 10:
		case 9:
			System.out.println("你的成績 得 A");
			break;
		case 8:
			System.out.println("你的成績 得 B");
			break;
		case 7:
			System.out.println("你的成績 得 C");
			break;
		case 6:
			System.out.println("你的成績 得 D");
			break;
		default:
			System.out.println("你的成績 得  E ，不及格 !");
		}
		
		System.out.print("輸入浮點數:");
		double input2 = scanner.nextDouble();

		System.out.print("輸入布林值:");
		boolean input3 = scanner.nextBoolean();
		
		if (input3 = true)
			System.out.println("是真的!");
			else
				System.out.println("是假的>< !");

		System.out.print("輸入字元:");
		char input4 = scanner.next().charAt(0);

		System.out.print("輸入字串:");
		String input5 = scanner.next(); // nextLine

		System.out.println("整數輸入:" + input1);
		System.out.println("浮點數輸入:" + input2);
		System.out.println("布林值輸入:" + input3);
		System.out.println("字元輸入:" + input4);
		System.out.println("字串輸入:" + input5);

		scanner.close();

	}

}
