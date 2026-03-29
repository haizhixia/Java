package example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*通过 Callable 和 Future 创建线程：
 * 	1. 创建 Callable 接口的实现类，并实现 call() 方法，该 call() 方法将作为线程执行体，并且有返回值。
 * 	2. 创建 Callable 实现类的实例，使用 FutureTask 类来包装 Callable 对象，该 FutureTask 对象封装了该 Callable 对象的 call() 方法的返回值。
 * 	3. 使用 FutureTask 对象作为 Thread 对象的 target 创建并启动新线程。
 * 	4. 调用 FutureTask 对象的 get() 方法来获得子线程执行结束后的返回值。
 */
public class CallableFuture {
	
	public static void main(String[] args) {
		
		System.out.println("主线程开始执行");
		
		//	创建 Callable 任务
        CallableTask task = new CallableTask("计算任务");
        
        //	创建 FutureTask
        FutureTask<Integer> ft = new FutureTask<>(task);
        
        //	主线程执行自己的任务
        for(int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + " 的循环变量i的值 " + i);
            
            //	当 i=10 时启动子线程
            if(i == 10) {
                System.out.println("===== 启动子线程 =====");
                new Thread(ft, "子线程").start();
            }
        }
        
        //	获取子线程的返回值
        try {
            Integer result = ft.get();
            System.out.println("子线程的返回值：" + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
        System.out.println("主线程执行完毕");
    }
		
}

class CallableTask implements Callable<Integer>{
	
	private String taskName;
	
	CallableTask(String name){
		taskName = name;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(taskName + "开始执行");
		int i = 0;
		for (i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			Thread.sleep(10);
		}
		System.out.println(taskName + "执行完成");
		return i;
	}
	
}