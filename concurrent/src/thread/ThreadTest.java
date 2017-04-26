package thread;

public class ThreadTest {
	public static void main(String[] args) {
		for (int i = 0; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			if (i==10) {
				// 创建一个新的线程 myThread1 此线程进入新建状态
				MyThread myThread1 = new MyThread();
				// 创建一个新的线程 myThread2 此线程进入新建状态
				MyThread myThread2 = new MyThread(); 
				myThread1.setPriority(8);
				myThread2.setPriority(3);
				myThread1.setName("线程1");
				myThread2.setName("线程2");
				// 调用start()方法使得线程进入就绪状态
				myThread1.start();	
				myThread2.start();	
			}
		}
	}
}
