
public class ReverseHello extends Thread {

	private static  int num = 50;
	private int currentThread;

	public ReverseHello(int current) {
		this.currentThread = current;
		System.out.println("hello from thread:" + current);

	}

	public static void reverseHello() {
		while (num > 0) {
			ReverseHello rh = new ReverseHello(num);
			rh.start();
			num--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseHello();

	}

}
