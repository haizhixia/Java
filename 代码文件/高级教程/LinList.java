package example;

import java.util.LinkedList;

public class LinList {
	public static void main(String[] args) {
		
		/*初始化
		 * 	1.普通创建方法：LinkedList<E> list = new LinkedList<E>();
		 * 	2.集合创建链表：LinkedList<E> list = new LinkedList(Collection<? extends E> c);
		 * 	E: 泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型。
		 */
		LinkedList<String> sites = new LinkedList<String>();
		sites.add("Resident Evil 2 Re");
		sites.add("Resident Evil 4 Re");
		System.out.println("初始内容为：" + sites);
		
		//在列表开头添加元素
		sites.addFirst("Resident Evil");
		System.out.println("添加后为：" + sites);
		
		//在列表结尾添加元素
		sites.addLast("Resident Evil Requiem");
		System.out.println("添加后为：" + sites);
		
		//在列表开头移除元素
		sites.removeFirst();
		System.out.println("移除后为：" + sites);
		
		//在列表结尾移除元素
		sites.removeLast();
		System.out.println("移除后为：" + sites);
		
		//获取列表开头的元素
		System.out.println("开头元素为：" + sites.getFirst());
		
		//获取列表结尾的元素
		System.out.println("结尾元素为：" + sites.getLast());
		
		/*迭代元素
		 *	1. 使用 for 配合 size() 方法
		 *	2. 使用 for-each 
		 */
		for (int i = 0; i < sites.size(); i++) {
			System.out.print(sites.get(i) + ", ");
		}
		System.out.println();
		
		for (String i : sites) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

}
