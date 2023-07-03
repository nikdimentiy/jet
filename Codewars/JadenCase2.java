// CodeWars task: solution -> https://www.codewars.com/kata/5390bac347d09b7da40006f6/java
// 🍀 Preparation -> to coding interview 🤞

package codewars; // declare the package name

// import the Character class from the java.lang package
import java.lang.Character;

/**
 * A class that converts a phrase to Jaden Case, where every word starts with a
 * capital letter.
 */
public class JadenCase2 {
	/**
	 * A method that takes a phrase as a string and returns it in Jaden Case.
	 * 
	 * @param phrase the input phrase as a string
	 * @return the phrase in Jaden Case as a string, or null if the input is null or
	 *         empty
	 */
	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.isEmpty()) { // check if the input is null or empty
			return null; // return null if the input is invalid
		} else { // otherwise
			char[] array = phrase.toCharArray(); // convert the phrase to a char array

			for (int x = 0; x < array.length; x++) { // loop through each char in the array
				if (x == 0 || array[x - 1] == ' ') { // check if the char is the first one or follows a space
					array[x] = Character.toUpperCase(array[x]); // capitalize the char using the Character class
				}
			}

			return new String(array); // return the char array as a string
		}
	}

	public static void main(String[] args) { // define the main method
		JadenCase2 jadenCase2 = new JadenCase2(); // create an instance of the JadenCase2 class
		String phrase = "How can mirrors be real if our eyes aren't real"; // define a sample phrase
		String jadenCasePhrase = jadenCase2.toJadenCase(phrase); // convert the phrase to Jaden Case using the method
		System.out.println(jadenCasePhrase); // print the result to the console
	}
}
