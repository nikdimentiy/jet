
public class Hobbit {
	String name;

	public static void main(String[] args) {
		Hobbit[] h = new Hobbit[3];
		int z = -1;

		while (z < 2) {
			z = z + 1;
			h[z] = new Hobbit();
			h[z].name = "Bilbo";
			if (z == 1) {
				h[z].name = "Froddo";
			}
			if (z == 2) {
				h[z].name = "Sam";
			}
			System.out.print(h[z].name + " - ");
			System.out.println("name of nice hobbit!");
		}
	}
}
