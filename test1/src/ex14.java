interface doit{
	String ex = "�@�� �Y���� , ";
	String dx = "�@�� �ܰ��d�s , ";
	public void eat();
	public void drink();
	public void play();
}

class ppp {
	String px = "�@�� ���±N";
	String py = "�@�� ���p��";
	String pz = "�@�� ���βy";
}

class ap1 extends ppp implements doit {
	public void eat() {
		System.out.print(ex);
	}
	public void drink() {
		System.out.print(dx);
	}
	public void play() {
		System.out.println(px);
	}
		
	}


class bp1 extends ppp implements doit {
	public void eat() {
		System.out.print(ex);
	}
	public void drink() {
		System.out.print(dx);
	}
	public void play() {
		System.out.println(py);
	}
		
	}
class cp1 extends ppp implements doit {
	public void eat() {
		System.out.print(ex);
	}
	public void drink() {
		System.out.print(dx);
	}
	public void play() {
		System.out.println(pz);
	}
		
	}


public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ap1 a = new ap1();
		bp1 b = new bp1();
		cp1 c = new cp1();
		
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
