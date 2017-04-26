package atomic;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {
	private final static AtomicLong sequenceNumber = new AtomicLong(0);
	private static Integer j = 0 ;
	public static long next(){
		return sequenceNumber.incrementAndGet();
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
//					System.out.println(j++);//会有重复
					System.out.println(next());//原子操作不会有重复
				}
			}).start();
			
			
		}
	}
}
