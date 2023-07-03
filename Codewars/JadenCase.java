// CodeWars task: solution -> https://www.codewars.com/kata/5390bac347d09b7da40006f6/java
// 🎯 Preparation -> to coding interview 😎

package codewars;

/**
 * A class that converts a phrase to Jaden Case, where every word starts with a
 * capital letter.
 */
public class JadenCase {
	/**
	 * A method that takes a phrase as a string and returns it in Jaden Case.
	 * 
	 * @param phrase the input phrase as a string
	 * @return the phrase in Jaden Case as a string, or null if the input is null or
	 *         empty
	 */
	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.isEmpty()) {
			return null; // return null if the input is invalid
		} else {
			String[] words = phrase.split(" "); // split the phrase into words by spaces
			StringBuilder jadenCaseBuilder = new StringBuilder(); // create a string builder to store the result

			for (String word : words) { // loop through each word
				String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1); // capitalize the first
																									// letter of each
																									// word
				jadenCaseBuilder.append(capitalizedWord).append(" "); // append the capitalized word and a space to the
																		// string builder
			}

			String jadenCasePhrase = jadenCaseBuilder.toString().trim(); // convert the string builder to a string and
																			// remove any trailing spaces
			return jadenCasePhrase; // return the final result
		}
	}

	public static void main(String[] args) {
		JadenCase jadenCase = new JadenCase(); // create an instance of the JadenCase class
		String phrase = "How can mirrors be real if our eyes aren't real"; // define a sample phrase
		String jadenCasePhrase = jadenCase.toJadenCase(phrase); // convert the phrase to Jaden Case using the method
		System.out.println(jadenCasePhrase); // print the result to the console
	}
}
