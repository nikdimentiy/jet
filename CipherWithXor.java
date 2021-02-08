// Using the XOR operation, we can encrypt the message.
// This type of encryption uses a single key, both for encryption and decryption.
// The cryptographic strength of such a key can be increased if its length is increased

public class CipherWithXor {
    public static void main(String[] args) {
        short secretKey = 0b0101;   // Secret key (length-16 bits)
        char character = 'A';      //  Source character for encryption

        System.out.println("Source character: " + character + ", its code in the code table: " + (byte) character);

        // Encrypting the character. character = 0100 0001 (65)
        character = (char) (character ^ secretKey); // 0100 0001 ^  0000 0101
        System.out.println("Encrypted character: " + character + ", its code in the code table: " + (byte) character);

        // Decoding the character. character = 0100 0100 (68)
        character = (char) (character ^ secretKey); // 0100 0100 ^ 0000 0101
        System.out.println("Decrypted character: " + character + ", its code in the code table: " + (byte) character);
    }
}
