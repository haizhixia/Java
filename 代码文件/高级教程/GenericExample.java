package example;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
	
	//泛型类
	public static class Box<T> {
		
		private T t;
		
		public void add(T t) {
			this.t = t;
		}
		
		public T get() {
			return t;
		}
		
		public static void main(String[] args) {
			Box<Integer> integerBox = new Box<Integer>();
			Box<String> stringBox = new Box<String>();	
			
			integerBox.add(new Integer(10));
			stringBox.add(new String("eclipse"));
			 
			System.out.printf("整型值为 :%d\n\n", integerBox.get());
			System.out.printf("字符串为 :%s\n", stringBox.get());
		}
		
	}
	
	//泛型通配符：1. 无界通配符：可以处理任何类型
	public static void getData(List<?> data, int index) {
		System.out.println("data.getData : " + data.get(index));
	}
	
	//泛型通配符：2. 上界通配符：只能处理Number子类
	public static void getUperNumber(List<? extends Number> data, int index) {
		System.out.println("data.getUperNumber : " + data.get(index));
	}
	
	//泛型通配符：3. 下界通配符：可以向列表添加元素
	public static void addDate(List<? super Integer> data) {
		data.add(12);
		data.add(15);
		System.out.println("data.size : " + data.size());
	}
	
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		List<Integer> num = new ArrayList<Integer>();
		List<Character> chars = new ArrayList<Character>();
		
		name.add("apple");
		name.add("pear");
		num.add(9);
		num.add(6);
		num.add(3);
		chars.add('a');
		
		getData(name, 1);
		getData(num, 2);
		getData(chars, 0);
		
		getUperNumber(num, 1);
		//getUperNumber(name, 1);	错误，String不是Number的子类
		//getUperNumber(chars, 0);	错误，Character不是Number的子类
		
		addDate(num);
		//addDate(chars);	错误，Character不是Integer的父类
		//addDate(name);	错误，String不是Integer的父类
		
	}
	
}
