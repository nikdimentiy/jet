// Factorial of number
public class MethodsFactorial {
// we using recursion method
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int factorial = factorial(10);

        System.out.println(factorial);
    }
}
