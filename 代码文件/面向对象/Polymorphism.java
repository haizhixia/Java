//多态
public class Polymorphism {
	/*图释
	class Shape{
		public void draw() {}
	}

	class Circle extends Shape{
		public void draw() {
			System.out.println("Circle.draw()");
		}
	}
	
	class Square extends Shape{
		public void draw() {
			System.out.println("Square.draw()");
		}
	}
	
	class Triangle extends Shape{
		public void draw() {
			System.out.println("Triangle.draw()");
		}
	}
	*/
	//实例
	public static void main(String[] args) {
		show(new Cat());	// 以 Cat 对象调用 show 方法
		show(new Dog());	// 以 Dog 对象调用 show 方法
		
		Animal a = new Cat();	// 向上转型
		a.eat();
		Cat c = (Cat)a;		 // 向下转型
		c.work();
	}
	
	public static void show(Animal a) {
		a.eat();
		//判断类型
		if(a instanceof Cat) {
			Cat c = (Cat)a;
			c.work();
		}else if(a instanceof Dog) {
			Dog c = (Dog)a;
			c.work();
		}
	}
	
}

abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{
	public void eat() {
		System.out.println("吃鱼");
	}
	public void work() {
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("吃肉");
	}
	public void work() {
		System.out.println("看家");
	}
}