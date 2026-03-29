//Java循环结构
public class Loop {
	
	/*while循环（结构如下）
	 * 
	 * while(布尔表达式){
	 * 	循环内容
	 * }
	 * 
	 * */
	public static void main(String[] args) {
		int x = 10;
		while(x < 12) {
			System.out.println(x);
			x++;
		}
	
	/*do...while循环（结构如下）
	 * 
	 * do{
	 * 		代码语句
	 * }while(布尔表达式);
	 * 
	 * */
		int y = 16;
		do {
			System.out.println(y);
			y++;
		}while(y < 20);
		
	/*for循环（结构如下）
	 * 
	 * for(初始化；布尔表达式；更新){
	 * 		代码语句
	 * }
	 * 
	 * */
		for(int a = 10; a < 15; a++) {
			System.out.println(a);
		}
		
	/*增强for循环（结构如下）
	 * 
	 * for(声明语句 : 表达式){
	 * 		代码语句
	 * }
	 * 
	 * */
		int [] numbers = {1,2,3,4,5};
		for(int b : numbers) {
			System.out.print(b + " ");
		}

	}
}
