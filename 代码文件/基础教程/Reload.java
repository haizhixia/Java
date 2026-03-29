public class Reload {
	String name;
	int age;
	
	//无参构造器
	public Reload() {
		this.name = "Unkonw";
		this.age = 0;
		System.out.println("这是一个无参构造方法创建的对象");
	}
	
	//有参构造器
	public Reload(String name) {
		this.name = name;
		this.age = 0;
		System.out.println("这是一个有参构造方法创建的对象，它命名为：" + name);
	}
	public Reload(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("这是一个有参构造方法创建的对象，它命名为：" + name + "，它的使用时长为" + age);
	}
	
	public static void main(String[] args) {
		Reload re1 = new Reload();// 调用无参构造方法
		Reload re2 = new Reload("Tom");// 调用单参数构造方法
		Reload re3 = new Reload("Tom",5);// 调用双参数构造方法
	}
	
}
