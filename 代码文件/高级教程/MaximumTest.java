package example;

public class MaximumTest {
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z){
		
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.printf("%d, %d, %d中最大的数为：%d\n", 3, 4, 5, maximum(3, 4, 5));
		System.out.printf("%.1f, %.1f, %.1f中最大的数为：%.1f\n", 1.1, 2.2, 3.3, maximum(1.1, 2.2, 3.3));
		System.out.printf("%s, %s, %s中最大的为：%s\n", "apple", "pear", "banana", maximum("apple", "pear", "banana"));
	}

}
