import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;

//Number类常用方法
public class NumberDemo {
	public static void main(String[] args) {
		
		//基本类型转换
		Number num = 1234.56;
		System.out.println(num.intValue());
		System.out.println(num.longValue());
		System.out.println(num.floatValue());
		System.out.println(num.doubleValue());
		
		//数值比较
		Integer x = 10;
		Double y = 10.0;
		System.out.println(x.doubleValue() == y.doubleValue());
		
		//处理大数
		BigInteger bigInteger = new BigInteger("1234567890");
		BigDecimal bigDecimal = new BigDecimal("123456789.987654321");
		//大数运算
		BigInteger sum = bigInteger.add(new BigInteger("1"));
		BigDecimal product = bigDecimal.multiply(new BigDecimal("2"));
		System.out.println(sum + " and " + product);
		
		//数值格式化
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(1234.5678));
		
	}
}
