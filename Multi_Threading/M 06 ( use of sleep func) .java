public class Sear extends Thread {
	String n;
	int i;

	Sear(String str, int a) {
		this.n = str;
		this.i = a;
	}

	public void run() {
		System.out.println(n + " got run " + i + " times");
		i += 1;
	}

	public static void main(String args[]) {
		Sear ob = new Sear("CS Thread", 0);
		Sear ob1 = new Sear("IT Thread", 0);
		ob.start();
		try {
			Thread.sleep(5000);  // Pause main thread for 0.5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ob1.start();
	}
}
