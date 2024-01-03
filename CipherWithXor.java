/**
 * This class demonstrates a simple encryption and decryption technique using the XOR operation.
 * The XOR operation is applied with a single secret key, both for encryption and decryption.
 * Increasing the length of the secret key enhances the cryptographic strength.
 */
public class CipherWithXor {

    /**
     * The main method serves as the entry point for the program.
     * It demonstrates the encryption and decryption of a character using the XOR operation.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        short secretKey = 0b0101;   // Secret key (length-16 bits)
        char character = 'A';      // Source character for encryption

        System.out.println("Source character: " + character + ", its code in the code table: " + (byte) character);

        // Encrypting the character. character = 0100 0001 (65)
        character = (char) (character ^ secretKey); // 0100 0001 ^  0000 0101
        System.out.println("Encrypted character: " + character + ", its code in the code table: " + (byte) character);

        // Decoding the character. character = 0100 0100 (68)
        character = (char) (character ^ secretKey); // 0100 0100 ^ 0000 0101
        System.out.println("Decrypted character: " + character + ", its code in the code table: " + (byte) character);
    }
}
