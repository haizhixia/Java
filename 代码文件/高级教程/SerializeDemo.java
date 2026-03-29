package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	
	public static void main(String[] args) {
		
		EmployeeExample e = new EmployeeExample();
		
		e.name = "leon";
		e.age = 49;
		e.salary = 100000;
		
		serializeEmployee(e, "employee.ser");
		
		EmployeeExample e2 = deserializeEmployee("employee.ser");
		
		System.out.println("原始对象: " + e);
		System.out.println("读取对象: " + e2);
		
	}
	
	//	序列化方法
	public static void serializeEmployee(EmployeeExample e, String filename) {
		
		//	序列化操作（将对象写入文件）
		try {
			//	创建文件输出流，指定保存路径
			FileOutputStream fileOut = new FileOutputStream(filename);
			
			 //	创建对象输出流，用于写入对象
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			//	将Employee对象写入文件
			out.writeObject(e);
			
			//	关闭流（先开后关）
			out.close();
			fileOut.close();
			
			System.out.println("序列化完成");
			System.out.println("Serialized data is saved in " + filename);
			
		} catch (Exception i) { //	捕获IO异常
			i.printStackTrace();
		}
	}
	
	//	反序列化方法
	public static EmployeeExample deserializeEmployee(String filename) {
		try {
			
			FileInputStream fileIn = new FileInputStream(filename);
			
			ObjectInputStream in = new ObjectInputStream(fileIn);
			
			EmployeeExample e = (EmployeeExample) in.readObject();
			
			in.close();
			fileIn.close();
			
			System.out.println("反序列化完成");
			return e;
			
		} catch (Exception i) {
			i.printStackTrace();
	        return null;
		}
		
	}

}
