package multithreading;

public class ThreadFun extends Thread {

	private String name;

	public ThreadFun(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "运行  " + i);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}

	public static void main(String[] args) {
		ThreadFun t1 = new ThreadFun("A");
		ThreadFun t2 = new ThreadFun("B");
		ThreadFun t3 = new ThreadFun("C");
		ThreadFun t4 = new ThreadFun("D");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
