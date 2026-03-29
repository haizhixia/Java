public class Constructor {
	
	//无参构造方法
	public Constructor() {
		System.out.println("这是一个无参构造方法创建的Constructor对象");
	}
	
	//有参构造方法
	public Constructor(String name) {
		//这个构造器仅有一个参数：name
		System.out.println("这是一个有参构造方法创建的Constructor对象，它命名为：" + name);
	}
	
	public static void main(String[] args) {
		//创建对象
		Constructor constructor1 = new Constructor();
		Constructor constructor2 = new Constructor("Tom");
	}
	
}
