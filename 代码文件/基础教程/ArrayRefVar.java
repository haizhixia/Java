//数组
public class ArrayRefVar {

	/*声明数组变量（语法）
	 *
	 *dataType[] arrayRefVar;  // 首选方法
	 *dataType arrayRefVar[];  // 效果相同，但不是首选方法
	 *
	 */
	double[] myList1;
	double myList2[];
	
	/*创建数组（语法）
	 * 
	 * arrayRefVar = new dataType[arraySize];	//使用new操作符来创建数组
	 * dataType[] arrayRefVar = new dataType[arraySize];	//数组变量的声明，和创建数组可以用一条语句完成
	 * dataType[] arrayRefVar = {value0, value1, ..., valuek};	//还可以使用该方式创建数组
	 * 
	 * */
	
	/*处理数组：使用基本循环或者 For-Each 循环
	 * 	展示如何创建、初始化和遍历操作数组
	 * 	For-Each 循环即为增强For循环
	 * */
	public static void main(String[] args) {
		double[] myList = {1.2, 2.3, 3.4, 4.5, 5.6};
		
		//打印所有数组元素
		//方法一（增强For循环）
		for(double a : myList) {
			System.out.print(a + " ");
		}
		System.out.println();
		//方法二
		//for(int a = 0; a < myList.length; a++){
		//		System.out.print(myList[a] + " ");
		//}
		
		//计算所有元素总和
		double total = 0;
		for(int i = 0; i < myList.length; i++) {
			total += myList[i];
		}
		System.out.println(total);
		//查找最大元素
		double max = myList[0];
		for(int b = 1; b < myList.length; b++) {
			if(myList[b] > max) {
				max = myList[b];
			}
		}
		System.out.println(max);
	}
	
	/*多维数组（动态初始化）
	 * type[][] typeName = new type[typeLength1][typeLength2];
	 * type 可以为基本数据类型和复合数据类型，typeLength1 和 typeLength2 必须为正整数，typeLength1 为行数，typeLength2 为列数。
	 * */
	
	/*多维数组的引用
	 * 	对二维数组中的每个元素，引用方式为 arrayName[index1][index2]
	 * */
	
}
