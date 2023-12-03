/**
 * A class representing an error with a message and severity level.
 */
class Err {
    String msg;
    int severity;

    /**
     * Constructor for creating an Err object with a message and severity level.
     *
     * @param m The error message.
     * @param s The severity level.
     */
    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

/**
 * A class providing error information and creating Err objects based on error codes.
 */
class ErrorInfo {
    String[] msgs = { "Fail input", "Fail output", "No needed space in drive", "Index out of bond" };
    int[] howbad = { 3, 3, 2, 4 };

    /**
     * Get an Err object based on the provided error code.
     *
     * @param i The error code.
     * @return An Err object with the corresponding message and severity level.
     */
    Err getErrorInfo(int i) {
        if (i >= 0 && i < msgs.length) {
            return new Err(msgs[i], howbad[i]);
        } else {
            return new Err("Non-existent error code!", 0);
        }
    }
}

/**
 * The main class demonstrating the usage of error information and Err objects.
 */
public class ErrInfo {
    /**
     * The main method where the program execution begins.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating an instance of ErrorInfo
        ErrorInfo err = new ErrorInfo();
        Err e;

        // Getting and displaying an Err object for error code 2
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " level: " + e.severity);

        // Getting and displaying an Err object for a non-existent error code (19)
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " level: " + e.severity);
    }
}
