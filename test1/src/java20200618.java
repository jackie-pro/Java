
public class java20200618 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.print("��J���:");
		int input1 = scanner.nextInt();

		if (input1 % 2 == 0)
			System.out.println(input1 + "�O����");
		if (input1 % 2 != 0)
			System.out.println(input1 + "�O�_��");
		int x = (input1 / 10);

		switch (x) {
		case 10:
		case 9:
			System.out.println("�A�����Z �o A");
			break;
		case 8:
			System.out.println("�A�����Z �o B");
			break;
		case 7:
			System.out.println("�A�����Z �o C");
			break;
		case 6:
			System.out.println("�A�����Z �o D");
			break;
		default:
			System.out.println("�A�����Z �o  E �A���ή� !");
		}
		
		System.out.print("��J�B�I��:");
		double input2 = scanner.nextDouble();

		System.out.print("��J���L��:");
		boolean input3 = scanner.nextBoolean();
		
		if (input3 = true)
			System.out.println("�O�u��!");
			else
				System.out.println("�O����>< !");

		System.out.print("��J�r��:");
		char input4 = scanner.next().charAt(0);

		System.out.print("��J�r��:");
		String input5 = scanner.next(); // nextLine

		System.out.println("��ƿ�J:" + input1);
		System.out.println("�B�I�ƿ�J:" + input2);
		System.out.println("���L�ȿ�J:" + input3);
		System.out.println("�r����J:" + input4);
		System.out.println("�r���J:" + input5);

		scanner.close();

	}

}
