abstract class aap{
	public void eat() {
		System.out.print("�Y = ����  ");
		
		
	}
	public void drink() {
		System.out.print("�� = ���d�s  ");
		
		
	}
	public void play() {
		
		
	}
		
	
}
class ap extends aap{
	public void play() {
		System.out.println("�� = ���βy");
		
	}
}

class bp extends aap{
	public void play() {
		System.out.println("�� = �ۺq");
		
	}
}

class cp extends aap{
	public void play() {
		System.out.println("�� = ���q��");
		
	}
}


public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aap a = new ap();
		aap b = new bp();
		aap c = new cp();
		
		System.out.println("A���w:");
		a.eat();
		a.drink();
		a.play();
		System.out.println("B���w:");
		b.eat();
		b.drink();
		b.play();
		System.out.println("C���w:");
		c.eat();
		c.drink();
		c.play();
	}

}
