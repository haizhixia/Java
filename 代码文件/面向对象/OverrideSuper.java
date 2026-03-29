//重写中关键词super的使用
class Animals{
	public void move() {
		System.out.println("动物是可以移动的");
	}
}

class Dogs extends Animals{
	public void move() {
		super.move();
		System.out.println("小狗可以跑也可以走");
	}
}

public class OverrideSuper {
	public static void main(String[] args) {
		Animals a = new Dogs();
	a.move();
	}
}