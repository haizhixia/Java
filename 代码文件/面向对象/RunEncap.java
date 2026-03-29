//运行
public class RunEncap {
	public static void main(String[] args) {
		
		EncapTest encap = new EncapTest();
		encap.setName("Tom"); 
		encap.setAge(6);
		encap.setId(1);
		
		System.out.println("Name:" + encap.getName() + " Age:" + encap.getAge() + " Id:" + encap.getId());
		
	}
}
