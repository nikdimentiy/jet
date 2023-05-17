package practice;

import java.util.Random;

/**
 * A class that generates random passwords.
 */
public class PasswordGenerator {

	/**
	 * A constant that represents all lowercase letters.
	 */
	private static final String LETTERS = "abcdefghijklmnopqrstuvwxyz";

	/**
	 * A constant that represents all uppercase letters.
	 */
	private static final String DIGITS = "0123456789";

	/**
	 * A constant that represents all symbols.
	 */
	private static final String SYMBOLS = "!@#$%^&*()_-+={}[]<>,.?/~";

	/**
	 * Generates a random password of the specified length.
	 *
	 * @param length The length of the password.
	 * @return A random password.
	 */
	public static String generatePassword(int length) {

		// Create a string of all possible characters.
		String characters = LETTERS + DIGITS + SYMBOLS;

		// Create a random number generator.
		Random rand = new Random();

		// Create a string builder to hold the password.
		StringBuilder password = new StringBuilder();

		// For each character in the password...
		for (int i = 0; i < length; i++) {

			// Generate a random index into the characters string.
			int randomIndex = rand.nextInt(characters.length());

			// Add the character at that index to the password.
			password.append(characters.charAt(randomIndex));
		}

		// Return the password.
		return password.toString();
	}

	/**
	 * The main method, which is used to test the class.
	 *
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {

		// Generate a password with the default length.
		int length = 8;
		String password = generatePassword(length);

		// Print the password.
		System.out.println("Generated password: " + password);
	}
}

