//Jackie-Java-ex9-20200629
public class ex9 {

		
	public static void printAdd2N(int max) {
		int sum = 0;
        for(int i =1; i < max+1; i++ ) {
        	sum += i ; }
    System.out.println("1.���^�ǭ�-�A��J���Ȭ�: "+max+" , ���G��: "+sum);
	}
		
    public static int getAdd2N(int max) {
	    int sum = 0;
        for(int i =1; i < max+1; i++ ) {
        	sum += i ; }
        return sum;
    }	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    System.out.println("�п�J�@�ӭ�:");
	    int input = scanner.nextInt();
	    
	    printAdd2N(input);
        
	    int ans = getAdd2N(input);		
		System.out.println("2.�^  ��  ��-�A��J���Ȭ�: "+input+" , ���G��: "+ans);	
	
		scanner.close();
	}

}
