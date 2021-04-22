// the code represent of "main" method overload

public class MethodsMainOverload {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            main();
        }
    }

    public static void main() {
        System.out.println("It's usual main method without String[] args!");
    }
}
