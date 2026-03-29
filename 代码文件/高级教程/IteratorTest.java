package example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		//获取迭代器
		Iterator<String> a = list.iterator();
		
		//输出第一个元素
		System.out.println("集合中的第一个元素为" + a.next());
		
		Iterator<String> b = list.iterator();
		
		/*循环集合元素
		 * 	最简单的方法是使用 while 循环
		 */
		System.out.print("循环集合元素：");
		while (b.hasNext()) {
			System.out.print(b.next() + " ");
		}
		System.out.println();
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(12);
		nums.add(8);
		nums.add(6);
		
		Iterator<Integer> c = nums.iterator();
		
		//删除集合中小于 10 的元素
		while (c.hasNext()) {
			Integer i = c.next();
			if (i < 10) {
				c.remove();
			}
		}
		System.out.print("删除集合中<10的元素：" + nums + " ");
		
	}

}
