class father1{
    year = y;
    
	public void birthday(int y, int m, int d) {
	System.out.println("���˪��ͤ� : "+y+" �~ "+m+ " �� "+d+" ��");
	}
}
class son1 extends father1{

    public void birthday(int y, int m, int d) {
    System.out.println("��l���ͤ� : "+y+" �~ "+m+" �� "+d+" ��");
    }
}
public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		father1 fb = new father1();
		father1 sb = new son1();
		fb.birthday(1976,3,29);
		sb.birthday(2006,4,24);
		
        
		



	}

}
