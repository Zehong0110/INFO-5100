import java.util.Random;

public class SumValue extends Thread {
	private int[] arr;
	private static final int numberofthreads = 2;
	private int low, high, partial;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		generateArray(arr);
		long sum = sum(arr);
		System.out.println("Sum:" + sum);

	}

	public SumValue(int[] arr, int low, int high) {
		this.arr = arr;
		this.low = low;
		this.high = Math.min(high, arr.length);
	}

	private static long sum(int[] arr) {
		// TODO Auto-generated method stub
		int len = (int) Math.ceil(1.0 * arr.length / numberofthreads);
		SumValue[] sums = new SumValue[numberofthreads];
		for (int i = 0; i < numberofthreads; i++) {
			sums[i] = new SumValue(arr, i * len, (i + 1) * len);
			sums[i].start();
		}

		try {
			for (SumValue sum : sums) {
				sum.join();
			}
		} catch (InterruptedException e) {
		}

		long total = 0;

		for (SumValue sum : sums) {
			total += sum.getPartialSum();
		}

		return total;

	}

	public int getPartialSum() {
		return partial;
	}

	public void run() {
		partial = sumRange(arr, low, high);
	}

	public static int sumRange(int[] a, int min, int max) {
		int result = 0;
		for (int i = min; i < max; i++) {
			result += a[i];
		}
		int toprint = max - 1;
		System.out.println("Sum of " + min + " to " + toprint + " numbers = " + result);
		return result;
	}
	
	private static void generateArray(int[] arr) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10);
			System.out.println(arr[i]);
		}
	}

}
