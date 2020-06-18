
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("請選擇要計算的圖形:");
		System.out.println("1.圓形  2.正方形  3.長方形 ");
		int input = scanner.nextInt();
		switch(input) {
		case 1:
			System.out.println("請輸入半徑:");
			int r = scanner.nextInt();
			float pi = 3.1415f;
			System.out.println("請選擇計算項目 1.周長  2.面積 :");
			int input1 = scanner.nextInt();
			if(input1 == 1) {
				System.out.print("你選擇的是計算 [圓形] 的周長 : " + (2 * r * pi));
				break;
			}
			else {
				System.out.print("你選擇的是計算 [圓形] 的面積 : " + (r * r * pi));
			    break;
			}
			
		case 2:
			System.out.println("請輸入邊長:");
			int l = scanner.nextInt();
			System.out.println("請選擇計算項目 1.周長  2.面積 :");
			int input2 = scanner.nextInt();
			if(input2 == 1) {
				System.out.println("你選擇的是計算 [正方形] 的周長 : " + (4 * l));
				break;
			}
				else {
					System.out.println("你選擇的是計算 [正方形] 的面積 : " +(l * l));
			     	break;
			}

		case 3:
			System.out.println("請輸入長:");
			int l1 = scanner.nextInt();
			System.out.println("請輸入寬:");
			int w = scanner.nextInt();
			System.out.println("請選擇計算項目 1.周長  2.面積 :");
			int input3 = scanner.nextInt();
			if(input3 == 1) {
				System.out.println("你選擇的是計算 [長方形] 的周長 : " + (2 *(l1 + w)));
				break;
			}
				else {
					System.out.println("你選擇的是計算 [長方形] 的面積 : " +(l1 * w));
			     	break;
			}
		}		
		scanner.close();
	}
}
