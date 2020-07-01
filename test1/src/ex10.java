class x{
	private int x1;
	private int x2;
	private int x4;
	private void x3(int a, int b) {
		x1 = a;
		x2 = b;
		x4 = x1 * x2;

    }
	
	public void setx3(int a, int b) {
		 x3(a,b);
		 
    }
	public int getx3() {
		return x4;
    }
}

public class ex10 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x ans = new x();
		java.util.Scanner scanner = new java.util.Scanner(System.in);
	    System.out.println("請輸入x1:");
	    int input1 = scanner.nextInt();
	    System.out.println("請輸入x2:");
	    int input2 = scanner.nextInt();
	    ans.setx3(input1,input2);
	    System.out.println("x4 = x1 * x2");
	    System.out.println("x4 = "+ans.getx3());
	    
    
	    scanner.close();

	}

}
