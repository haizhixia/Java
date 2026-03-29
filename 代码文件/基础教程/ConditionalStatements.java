//条件语句
public class ConditionalStatements {
	public static void main(String[] args) {
		
		/*if语句（结构如下）
		 * 
		 * if(布尔表达式){
		 * 		代码语句（结果值为true执行）
		 * }
		 * 
		 * */
		int x = 10;
		if(x < 15) {
			System.out.println("这是if语句");
		}
		
		/*if...else语句（结构如下）
		 * 
		 * if(布尔表达式){
		 * 		代码语句（结果值为true执行）
		 * }else{
		 * 		代码语句（结果值为false执行）
		 * }
		 * 
		 * */
		int y = 12;
		if(y < 15) {
			System.out.println("这是if语句");
		}else {
			System.out.println("这是else语句");
		}
		
		/*if...else if...else 语句（结构如下）
		 * 
		 * if(布尔表达式1){
		 *		代码语句（1结果值为true执行）
		 * }else if(布尔表达式2){
		 * 		代码语句（2结果值为true执行）
		 * }else if(布尔表达式3){
		 * 		代码语句（3结果值为true执行）
		 * }else{
		 * 		代码语句（结果值均为false执行）
		 * }
		 * 
		 * */
		int z = 20;
		if(z == 5) {
			System.out.print(z);
		}else if(z == 10) {
			System.out.print(z);
		}else if(z == 20) {
			System.out.print(z);
		}else {
			System.out.print("这是else语句");
		}
		
		/*嵌套的 if…else 语句（结构如下）
		 * 
		 * if(布尔表达式1){
		 * 		代码语句（1结果值为true执行）
		 * 		if(布尔表达式2){
		 * 			代码语句（2结果值为true执行）
		 * 		}
		 * }
		 * 
		 * */
		int a = 10;
		int b = 20;
		if(a == 10) {
			if(b == 20) {
				System.out.print("a = 10 and b = 20");
			}
		}
	}
}
