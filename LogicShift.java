// logic shift
public class LogicShift {

    public static void main(String[] args) {
        byte operand = 0b0000001;              // 0000 0001
        System.out.println("Number before shift : " + operand);

        // Logically shift a number to the left

        operand = (byte) (operand << 2);   // 0000 0100
        System.out.println("Number after shift left : " + operand);

        // Logically shift a number to the right

        operand = (byte) (operand >> 1);   // 0000 0010

        System.out.println("Number after right shift: " + operand);
    }
}
