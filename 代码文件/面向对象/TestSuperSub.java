//构造器
class SuperClass {
	private int n;
	
	//	无参构造器
	public SuperClass() {
		System.out.println("无参构造器SuperClass()");
	}
	
	//	有参构造器
	public SuperClass(int n) {
		System.out.println("有参构造器SuperClass(int n)");
		this.n = n;
	}
}
		
class SubClass1 extends SuperClass{
	private int n;
	
	//	无参构造器，自动调用父类的无参数构造器
	public SubClass1() {
		System.out.println("无参构造器SubClass()");
	}
		
	//	有参构造器，调用父类中带有参数的构造器
	public SubClass1(int n) {
		super(300);
		System.out.println("有参构造器SubClass(int n):" + n);
		this.n = n;
	}
}

class SubClass2 extends SuperClass{
	private int n;
	
	//	无参构造器，调用父类中带有参数的构造器
	public SubClass2() {
		super(300);
		System.out.println("无参构造器SubClass()");
	}
		
	//	有参构造器，自动调用父类的无参数构造器
	public SubClass2(int n) {
		System.out.println("有参构造器SubClass(int n):" + n);
		this.n = n;
	}
}


public class TestSuperSub{
	public static void main(String[] args) {
		System.out.println("---- Subclass1 类继承 ----");
		SubClass1 sc1 = new SubClass1();
		SubClass1 sc2 = new SubClass1(100);
		
		System.out.println("---- Subclass2 类继承 ----");
		SubClass2 sc3 = new SubClass2();
		SubClass2 sc4 = new SubClass2(200);
	}
}