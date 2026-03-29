package example;

public class TestRunnable {
	
	public static void main(String[] args) {
		
		RunnableExample taskOne = new RunnableExample("Thread-01");
		taskOne.start();
		
		RunnableExample taskTwo = new RunnableExample("Thread-02");
		taskTwo.start();
		
		ThreadExample taskThree = new ThreadExample("Thread-03");
		taskThree.start();
		
	}

}

/*通过实现 Runnable 接口来创建线程：
 *	创建一个线程，最简单的方法是创建一个实现 Runnable 接口的类
 * 	为了实现 Runnable，一个类只需要执行一个方法调用 run()
 * 	在创建一个实现 Runnable 接口的类之后，你可以在类中实例化一个线程对象
 * 	新线程创建之后，你调用它的 start() 方法它才会运行
 */
class RunnableExample implements Runnable{
	
	private Thread t;
	private String threadName;
	
	/*	接收线程名称参数
	 * 	打印创建信息
	 * 	注意：此时 未创建 Thread 对象
	 */
	RunnableExample(String name){
		threadName = name;
		System.out.println("Runnable方式 ：creating : " + threadName);
	}
	
	//	可以重写该方法，重要的是理解的 run() 可以调用其他方法，使用其他类，并声明变量，就像主线程一样。
	public void run() {
		System.out.println("Runnable方式 ：running : " + threadName);
		//	线程要执行的核心任务
		try {
			for(int i = 4; i > 0; i--) {
				System.out.println("Runnable方式 ：Thread " + threadName + ", " + i);
				//	每次输出后休眠 1000 毫秒
				Thread.sleep(1000);
			}
		}
		//	如果被中断，捕获异常并打印信息
		catch (InterruptedException e) {
			System.out.println("Runnable方式 ：Thread " + threadName + " interrupted...");
		}
		System.out.println("Runnable方式 ：Thread " + threadName + " exiting...");
	}
	
	public void start() {
		System.out.println("Runnable方式 ：starting " + threadName);
		//	检查 Thread 对象是否已创建
		if(t == null) {
			//	创建新的 Thread 对象
			t = new Thread(this, threadName);
			//	调用 Thread 类的真正 start() 方法
			//	该 start() 方法为 final 方法
			t.start();
		}
	}
	
}

/*通过继承Thread来创建线程：
 * 	创建一个新的类，该类继承 Thread 类，然后创建一个该类的实例
 * 	继承类必须重写 run() 方法，该方法是新线程的入口点。它也必须调用 start() 方法才能执行。
 * 	本质上也是实现了 Runnable 接口的一个实例（！！！）
 */
class ThreadExample extends Thread{
	
	ThreadExample(String name){
		//	设置线程名称
		super(name);
	}
	
	public void run() {
		System.out.println("继承Thread方式 ：running : " + getName());
		//	线程要执行的核心任务
		try {
			for(int i = 4; i > 0; i--) {
				System.out.println("继承Thread方式 ：Thread " + getName() + ", " + i);
				//	每次输出后休眠 1000 毫秒
				Thread.sleep(1000);
			}
		}
		//	如果被中断，捕获异常并打印信息
		catch (InterruptedException e) {
			System.out.println("继承Thread方式 ：Thread " + getName() + " interrupted...");
		}
		System.out.println("继承Thread方式 ：Thread " + getName() + " exiting...");
	}
	
}

/*	”创建线程的两种方式本质上是一样的，都是通过 Runnable 接口“ 解析：
 *	1.	Thread 类本身实现了 Runnable 接口
 * 	2.	当你继承 Thread 时，你的类自动成为 Runnable 的实现类
 * 	3.	两种创建线程的方式，本质上都是提供一个 Runnable 实例
 * 	4.	继承 Thread：你的类既是 Thread 又是 Runnable
 * 	5.	实现 Runnable：你的类只是 Runnable，需要包装到 Thread 中
 *	
 *	无论用哪种方式，最终都需要：
 *	1.	提供 run() 方法的实现
 *	2.	通过某种方式让 start() 被调用
 *	3.	JVM 执行 run() 方法中的代码
 */
