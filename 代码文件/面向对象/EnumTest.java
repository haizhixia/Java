//枚举类

enum Color{
	red, yellow, green, blue;
	
	//构造函数
	private Color()
    {
        System.out.println("Constructor called for : " + this.toString());
    }
 
    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
	
}

public class EnumTest {
	
	//内部类中使用枚举
	enum Goods{
		desk, book, toy, pencil;
	}
	
	//测试输出结果
	public static void main(String[] args) {
		Color c1 = Color.blue;
		Goods g1 = Goods.desk;
		System.out.println(g1 + "的颜色是" + c1);
	
		//迭代枚举元素( for 语句)
		for (Color myColor : Color.values()) {
			System.out.println(myColor);
		}
		
		//在 switch 中使用枚举类
		Color key = Color.red;
		switch (key) {
		case red:
			System.out.println("红色");
			break;
		case green:
			System.out.println("绿色");
			break;
		default:
			System.out.println("不存在");
			break;
		}
		
		// 调用 values()
        Goods[] arr = Goods.values();
 
        // 迭代枚举
        for (Goods goods : arr)
        {
            // 查看索引
            System.out.println(goods + " at index " + goods.ordinal());
        }
 
        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
        //System.out.println(Goods.valueOf("Desk"));
        System.out.println(Goods.valueOf("desk"));
		
	}
}
