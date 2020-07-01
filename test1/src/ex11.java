class father{
	int year = 1976;
	int mon = 3;
	int day = 29;
   
	public void birthday() {
	System.out.println("父親的生日 : "+year+" 年 "+mon+ " 月 "+day+" 日");
	}
}
class son extends father{
	int year = 2006;
	int mon = 4;
	int day = 24;

    public void birthday() {
    System.out.println("兒子的生日 : "+year+" 年 "+mon+" 月 "+day+" 日");
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
 String fb = year+"年"+mon+"月"+"日"+date;
		 }
public class ex11 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
    son birthday = new son();
    
	System.out.println("父親生日 = "+birthday.fb);


}

}
*/