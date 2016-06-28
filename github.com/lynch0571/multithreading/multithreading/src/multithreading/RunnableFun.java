package multithreading;

public class RunnableFun implements Runnable {

	private String name;

	public RunnableFun(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "运行 " + i);
		}
	}

	public static void main(String[] args) {
		RunnableFun r1=new RunnableFun("A");
		Thread t1=new Thread(r1);
		
		RunnableFun r2=new RunnableFun("B");
		Thread t2=new Thread(r2);
		
		RunnableFun r3=new RunnableFun("C");
		Thread t3=new Thread(r3);
		
		RunnableFun r4=new RunnableFun("D");
		Thread t4=new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
