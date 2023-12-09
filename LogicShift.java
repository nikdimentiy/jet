/**
 * This program demonstrates logical left and right shifts on a byte value.
 */
public class LogicShift {

    /**
     * Main method to execute the logic shift operations.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize a byte variable with binary value 0000 0001
        byte operand = 0b0000001;
        System.out.println("Number before shift: " + operand);

        // Perform a logical left shift by 2 positions (resulting in 0000 0100)
        operand = (byte) (operand << 2);
        System.out.println("Number after left shift: " + operand);

        // Perform a logical right shift by 1 position (resulting in 0000 0010)
        operand = (byte) (operand >>> 1);
        System.out.println("Number after right shift: " + operand);
    }
}
