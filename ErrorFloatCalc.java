// for a visual representation of the error of float calculations
public class ErrorFloatCalc {
    public static void main(String[] args) {
        double a;
        a = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        System.out.println("Result of operation addition is: " + a);
        if (a == 1)
            System.out.println("The value of the result of an addition is equivalent to unity!");
        else
            System.out.println("This is mistake!");

    }
}
