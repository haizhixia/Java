//switch case 语句
public class Switch {
	public static void main(String[] args) {
		
		/*switch case 语句（结构如下）
		 * 
		 * switch(expression){
		 * 		case value:
		 * 			代码语句
		 * 			break;//选择性使用
		 * 		case value:
		 * 			代码语句
		 * 			break;//选择性使用
		 * 		...
		 * 		default://选择性使用
		 * 			代码语句
		 * }
		 * 
		 * */
		char grade = 'A';
		switch (grade) {
			case 'A':
				System.out.println("优秀"); 
				break;
			case 'B':
				System.out.println("良好");
				break;
			case 'C':
				System.out.println("及格");
				break;
			case 'D':
				System.out.println("你需要再努力努力");
				break;
			default :
				System.out.println("建议重修该课程");
			}
		System.out.println("你的等级是 " + grade);
	}
}
