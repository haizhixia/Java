package example;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		//HashMap 的 key 与 value 类型可以相同也可以不同
		HashMap<Integer, String> list = new HashMap<Integer, String>();
		
		/*添加元素
		 * 	添加键值对(key-value)可以使用 put() 方法
		 */
		list.put(1, "one");
		list.put(2, "two");
		list.put(3, "three");
		list.put(10, "ten");
		System.out.println("内容：" + list);
		
		/*访问元素
		 * 	使用 get(key) 方法来获取 key 对应的 value
		 */
		String s1 = list.get(1);
		System.out.println("访问的元素为：" + s1);
		
		/*迭代元素
		 * 	使用 for-each 来迭代 HashMap 中的元素
		 * 	如果只想获取 key，可以使用 keySet() 方法，然后可以通过 get(key) 获取对应的 value
		 * 	如果只想获取 value，可以使用 values() 方法。
		 */
		System.out.println("只获取 key，然后通过 get方法获取对应的 value：");
		for (Integer i : list.keySet()) {
			System.out.println("key: " + i + " value: " + list.get(i));
		}
		
		System.out.println("只获取 value:");
		for (String value : list.values()) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		/*删除元素
		 * 	使用 remove(key) 方法来删除 key 对应的键值对(key-value)
		 * 	删除所有键值对(key-value)可以使用 clear 方法
		 */
		list.remove(10);
		System.out.println("删除后的内容：" + list);
		list.clear();
		System.out.println(list);
		
	}

}
