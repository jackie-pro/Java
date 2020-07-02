interface doit{
	String ex = "一邊 吃牛排 , ";
	String dx = "一邊 喝高粱酒 , ";
	public void eat();
	public void drink();
	public void play();
}

class ppp {
	String px = "一邊 打麻將";
	String py = "一邊 打小孩";
	String pz = "一邊 打棒球";
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
		
		System.out.println("A喜歡:");
		a.eat();
		a.drink();
		a.play();
		System.out.println("B喜歡:");
		b.eat();
		b.drink();
		b.play();
		System.out.println("C喜歡:");
		c.eat();
		c.drink();
		c.play();
	}

}
