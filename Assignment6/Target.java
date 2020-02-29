package Assignment6;

public class Target {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6, 6, 8, 9 }; 
		//int[] arr1= {};
		int target = 11; 
        System.out.println(findClosest(arr, target));

	}

	public static int findClosest(int[] arr, int target) {
		//if A is null or A is empty, throw exception to remind users.
		if (arr==null || arr.length==0) {
			throw new NullPointerException();
		}
		
		int n = arr.length;

		// Corner cases
		if (target <= arr[0])
			return arr[0];
		if (target >= arr[n - 1])
			return arr[n - 1];

		// Doing binary search
		int i = 0, j = n, mid = 0;
		while (i < j) {
			mid = (i + j) / 2;

			if (arr[mid] == target)
				return arr[mid];

			
			if (target < arr[mid]) {

				// If target is greater than previous
				// to mid, return closest of two
				if (mid > 0 && target > arr[mid - 1])
					return getClosest(arr[mid - 1], arr[mid], target);

				/* Repeat for left half */
				j = mid;
			}

			// If target is greater than mid
			else {
				if (mid < n - 1 && target < arr[mid + 1])
					return getClosest(arr[mid], arr[mid + 1], target);
				i = mid + 1; // update i
			}
		}

		// Only single element left after search
		return arr[mid];
	}

	public static int getClosest(int val1, int val2, int target) {
		if (target - val1 >= val2 - target)
			return val2;
		else
			return val1;
	}

}
