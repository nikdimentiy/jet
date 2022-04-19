class Test {
	static void sum(int... a) { // test of vararg - it's the array of arguments
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sum(1, 8, 15); // equals sum(new int[]{1, 8, 15})
	}
}
