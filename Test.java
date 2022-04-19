class Test {
	static void sum(int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sum(1, 8, 15);
	}
}
