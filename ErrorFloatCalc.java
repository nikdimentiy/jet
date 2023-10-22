public class ErrorFloatCalc {
    public static void main(String[] args) {
        double a;

        // Perform a series of floating-point additions
        a = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        // Print the result of the addition
        System.out.println("Result of operation addition is: " + a);

        // Check if the result 'a' is equal to 1
        if (a == 1)
            System.out.println("The value of the result of an addition is equivalent to unity!");
        else
            System.out.println("This is a mistake!");
    }

    // Driver code to execute the ErrorFloatCalc class
    public static void main(String[] args) {
        ErrorFloatCalc errorFloatCalc = new ErrorFloatCalc();
        errorFloatCalc.main(args);
    }
}

