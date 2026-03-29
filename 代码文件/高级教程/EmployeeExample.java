package example;

import java.io.Serializable;

public class EmployeeExample implements Serializable{
		
	private static final long serialVersionUID = 1L;
		
	//	公共属性
	public String name;
	public int age;
	public int salary;
		
	@Override
	public String toString() {
		return "EmployeeExample{name : '" + name + "', age : '" + age + "', salary : '" + salary + "}";
	}
	
}
