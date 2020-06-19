class A{
	String Name = "A大樓設計圖";
	int Size = 30;
	String Price = "300萬";
	int Quantity = 20;
}
public class ex5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   A A1 = new A();
	   A1.Name = "A1大樓";
	   A1.Price = "350萬";
	   System.out.println("Name:"+ A1.Name);
	   System.out.println("Size:"+ A1.Size);
	   System.out.println("Price:"+ A1.Price);
	   System.out.println("Quantity:"+ A1.Quantity);
	   
	   System.out.println();
	   
	   A A2 = new A();
       A2.Name = "A2大樓";
	   A2.Quantity = 30;
	   System.out.println("Name:"+ A2.Name);
	   System.out.println("Size:"+ A2.Size);
	   System.out.println("Price:"+ A2.Price);
	   System.out.println("Quantity:"+ A2.Quantity);
	   
	   

	}

}
