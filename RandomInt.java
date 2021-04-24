// type conversion to get a random integer (through CLA)

public class RandomInt {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = Math.random();
        int value = (int) (r * n);
        System.out.print("Result of operation is: ");
        System.out.println(value);
    }
}
