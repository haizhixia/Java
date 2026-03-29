import java.util.Scanner;

//Scanner类
public class TestScanner {
	public static void main(String[] args) {
		
		//使用next方法
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("next方式接收：");
		if(scanner1.hasNext()) {
			String str1 = scanner1.next();
			System.out.println("输入的数据为：" + str1);;
		}
		scanner1.close();
		
		//使用nextLine方法
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("nextLine方式接收：");
		if(scanner2.hasNextLine()) {
			String str2 = scanner2.next();
			System.out.println("输入的数据为：" + str2);;
		}
		scanner2.close();
		
		//hasNextXXX()
		Scanner scanner3 = new Scanner(System.in);
	    // 从键盘接收数据
	    int i = 0;
	    float f = 0.0f;
	    System.out.print("输入整数：");
	    if (scanner3.hasNextInt()) {
	         // 判断输入的是否是整数
	         i = scanner3.nextInt();
	         // 接收整数
	         System.out.println("整数数据：" + i);
	    }else{
	         // 输入错误的信息
	         System.out.println("输入的不是整数！");
	    }
	    System.out.print("输入小数：");
	    if (scanner3.hasNextFloat()) {
	         // 判断输入的是否是小数
	         f = scanner3.nextFloat();
	         // 接收小数
	         System.out.println("小数数据：" + f);
	    }else{
	         // 输入错误的信息
	         System.out.println("输入的不是小数！");
	    }
	    scanner3.close();
		
		//实例：输入多个数字，并求其总和与平均数
		System.out.println("请输入数字：");
		Scanner scan = new Scanner(System.in);
		
		double x = 0;
		int y = 0;
		
		while(scan.hasNextDouble()) {
			double a = scan.nextDouble();
			y = y + 1;
			x = x + a;
		}
		System.out.println(y + "个数的和为" + x);
		System.out.println(y + "个数的平均数为" + (x/y));
		
	}
}
