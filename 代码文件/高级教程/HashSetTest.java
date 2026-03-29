package example;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> list = new HashSet<String>();
		
		//添加元素
		list.add("Google");
		list.add("TaoBao");
		list.add("Google");// 重复的元素不会被添加
		System.out.println(list);
		
		/*判断元素是否存在
		 * 	使用 contains() 方法来判断元素是否存在于集合当中
		 */
		boolean result = list.contains("taobao");
		System.out.println(result);
		
		/*以下用法与LinkedList相同
		 * 	使用 for-each 来迭代 HashSet 中的元素
		 * 	计算 HashSet 中的元素数量可以使用 size() 方法
		 * 	使用 remove() 方法来删除集合中的元素
		 */
		
		//清除元素
		list.clear();
	}

}
