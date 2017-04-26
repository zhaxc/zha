package lock;

public class Worker {
	private String name; // 名字
	private long workDuration; // 工作持续时间

	public Worker(String name, long workDuration) {
		super();
		this.name = name;
		this.workDuration = workDuration;
	}

	/**
	 * 完成工作
	 */
	public void doWork() {
		
		System.out.println(name + " begins to work...");

		try {
			Thread.sleep(workDuration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(name + " has finished the job...");
		
	}
}
