class father{
	int year = 1976;
	int mon = 3;
	int day = 29;
   
	public void birthday() {
	System.out.println("���˪��ͤ� : "+year+" �~ "+mon+ " �� "+day+" ��");
	}
}
class son extends father{
	int year = 2006;
	int mon = 4;
	int day = 24;

    public void birthday() {
    System.out.println("��l���ͤ� : "+year+" �~ "+mon+" �� "+day+" ��");
    }
}
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		father fb = new father();
		son sb = new son();
	    fb.birthday();
		sb.birthday();
        
		



	}

}
/*
class father{
String year = "1976";
String mon = "3";
String date = "29";
}
class son extends father{
 String fb = year+"�~"+mon+"��"+"��"+date;
		 }
public class ex11 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
    son birthday = new son();
    
	System.out.println("���˥ͤ� = "+birthday.fb);


}

}
*/