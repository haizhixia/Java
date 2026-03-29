//Math类常用方法
public class MathDemo {
	public static void main(String[] args) {
		
		//指数对数运算
		Math.exp(1);
		Math.log(Math.E);
		Math.log10(100);
		
		//随机数生成
		//生成[0.0, 1.0)之间的随机数
		double random = Math.random();
		//生成[1, 100]的随机整数
		int randomInt = (int)(Math.random() * 100) + 1;
		System.out.println(random + " 和 "  + randomInt);
		
		//其他运算
		Math.hypot(3, 4); // 计算sqrt(x²+y²) → 5.0
		Math.IEEEremainder(10, 3); // IEEE余数 → 1.0
		
		//常量字段
		System.out.println("π的值是：" + Math.PI);// π ≈ 3.141592653589793
		System.out.println("e的值是：" + Math.E);// 自然对数底数e ≈ 2.718281828459045
		
	}
}
