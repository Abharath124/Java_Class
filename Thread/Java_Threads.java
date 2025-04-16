package my;
class MyThread extends Thread{ //Threas class
	public void run() {
//		System.out.println("Thread is running...");
		for(int i = 0;i<5;i++) {
			System.out.println("Thread is running..."+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Thread is not running..."+e);
			}
		}
	}
}
public class Java_Threads {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		m1.run();
		System.out.println("Thread is completed...");
	}

}
