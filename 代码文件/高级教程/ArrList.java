package example;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
	public static void main(String[] args) {
		
		/*初始化
		 *	语法：ArrayList<E> objectName =new ArrayList<>();
		 *	E: 泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型。
		 *	objectName: 对象名。
		 */
		ArrayList<String> sites = new ArrayList<String>();
		
		/*添加元素
		 * 	添加元素到 ArrayList 可以使用 add() 方法
		 */
		sites.add("Tencent");
		sites.add("Taobao");
		sites.add("YouTube");
		sites.add("Google");
		System.out.println(sites);
		
		/*访问元素
		 * 	访问 ArrayList 中的元素可以使用 get() 方法
		 * 	数组的索引值从 0 开始。
		 */
		String s1 = sites.get(0);
		System.out.println(s1);
		
		/*修改元素
		 * 	修改 ArrayList 中的元素可以使用 set() 方法： set(int index, E element) 
		 * 	方法的第一个参数是索引（index），表示要替换的元素的位置，第二个参数是新元素（element），表示要设置的新值
		 */
		sites.add("0");
		System.out.println("修改前元素数组为：" + sites);
		sites.set(4, "1");
		System.out.println("修改后元素数组为：" + sites);
		
		/*删除元素
		 * 	删除 ArrayList 中的元素可以使用 remove() 方法
		 */
		System.out.println("删除前元素数组为：" + sites);
		sites.remove(4);
		System.out.println("删除后元素数组为：" + sites);
		
		/*计算大小
		 * 	计算 ArrayList 中的元素数量可以使用 size() 方法
		 */
		int s2 = sites.size();
		System.out.println("元素数量为" + s2);
		
		/*迭代数组列表
		 * 	1. for 来迭代数组列表中的元素
		 * 	2. for-each 来迭代元素
		 */
		System.out.println("for循环迭代数组：");
		for (int i = 0; i < s2; i++) {
			System.out.print(sites.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("for-each 来迭代元素：");
		for (String i : sites) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/*其他的引用类型
		 * 	boolean -> Boolean
		 * 	byte -> Byte
		 * 	short -> Short
		 * 	int -> Integer
		 * 	long -> Long
		 * 	float -> Float
		 * 	double -> Double
		 * 	char -> Character
		 * 	此外，BigInteger、BigDecimal 用于高精度的运算，BigInteger 支持任意精度的整数，也是引用类型，但它们没有相对应的基本类型。
		 */
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(100);
		num.add(85);
		num.add(66);
		num.add(36);
		System.out.println("int类型的元素数组：" + num);
		
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('e');
		list.add('a');
		list.add('E');
		System.out.println("char类型的元素数组：" + list);
		
		/*ArrayList排序
		 * 	Collections 类也是一个非常有用的类，位于 java.util 包中，提供的 sort() 方法可以对字符或数字列表进行排序
		 */
		Collections.sort(sites);// 字母排序
		System.out.println("排序后的数组为：");
		for (String i : sites) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		Collections.sort(num);
		System.out.println("排序后的数组为：");
		for (Integer i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
