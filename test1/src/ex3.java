
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("�п�ܭn�p�⪺�ϧ�:");
		System.out.println("1.���  2.�����  3.����� ");
		int input = scanner.nextInt();
		switch(input) {
		case 1:
			System.out.println("�п�J�b�|:");
			int r = scanner.nextInt();
			float pi = 3.1415f;
			System.out.println("�п�ܭp�ⶵ�� 1.�P��  2.���n :");
			int input1 = scanner.nextInt();
			if(input1 == 1) {
				System.out.print("�A��ܪ��O�p�� [���] ���P�� : " + (2 * r * pi));
				break;
			}
			else {
				System.out.print("�A��ܪ��O�p�� [���] �����n : " + (r * r * pi));
			    break;
			}
			
		case 2:
			System.out.println("�п�J���:");
			int l = scanner.nextInt();
			System.out.println("�п�ܭp�ⶵ�� 1.�P��  2.���n :");
			int input2 = scanner.nextInt();
			if(input2 == 1) {
				System.out.println("�A��ܪ��O�p�� [�����] ���P�� : " + (4 * l));
				break;
			}
				else {
					System.out.println("�A��ܪ��O�p�� [�����] �����n : " +(l * l));
			     	break;
			}

		case 3:
			System.out.println("�п�J��:");
			int l1 = scanner.nextInt();
			System.out.println("�п�J�e:");
			int w = scanner.nextInt();
			System.out.println("�п�ܭp�ⶵ�� 1.�P��  2.���n :");
			int input3 = scanner.nextInt();
			if(input3 == 1) {
				System.out.println("�A��ܪ��O�p�� [�����] ���P�� : " + (2 *(l1 + w)));
				break;
			}
				else {
					System.out.println("�A��ܪ��O�p�� [�����] �����n : " +(l1 * w));
			     	break;
			}
		}		
		scanner.close();
	}
}
