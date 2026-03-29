package example;

public class GenericMethodTest {
	
	//泛型方法 printArray
	public static <E> void printArray( E[] inputArray ) {
		
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		Character[] charArray = {'a', 'p', 'p', 'l', 'e'};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		System.out.println("整型数组元素为：");
		printArray(intArray);
		
		System.out.println("双精度型数组元素为：");
		printArray(doubleArray);
		
		System.out.println("字符型数组元素为：");
		printArray(charArray);
		
		
	}
	
}
