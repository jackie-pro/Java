abstract class aap{
	public void eat() {
		System.out.print("吃 = 牛排  ");
		
		
	}
	public void drink() {
		System.out.print("喝 = 高粱酒  ");
		
		
	}
	public void play() {
		
		
	}
		
	
}
class ap extends aap{
	public void play() {
		System.out.println("玩 = 打棒球");
		
	}
}

class bp extends aap{
	public void play() {
		System.out.println("玩 = 唱歌");
		
	}
}

class cp extends aap{
	public void play() {
		System.out.println("玩 = 打電動");
		
	}
}


public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aap a = new ap();
		aap b = new bp();
		aap c = new cp();
		
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
