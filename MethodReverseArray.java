import java.util.Arrays;

public class MethodReverseArray {

	public static void main(String[] args) {
		var arr_1 = new int[5];
		arr_1 = new int[] { 3, 5, 1, 9, 7 };
		Arrays.sort(arr_1);
		reverse(arr_1); // call method to reverse array
		System.out.println(Arrays.toString(arr_1));
	}

	private static void reverse(int[] arr_1) {
		int n = arr_1.length; // length of the array
		
		// swapping the first half elements with last half elements
		// by analogy, the exchange of two variables using temp variable
		for (int i = 0; i < n / 2; i++) {
			int temp = arr_1[i];
			arr_1[i] = arr_1[n - i - 1];
			arr_1[n - i - 1] = temp;
		}

	}
}
