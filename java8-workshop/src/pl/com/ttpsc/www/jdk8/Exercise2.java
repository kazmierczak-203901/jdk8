package pl.com.ttpsc.www.jdk8;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

	private static final String WORD_REGEXP = "[- .:,]+";

	/**
	 * Exercise 1
	 *
	 * Create a new list with all the strings from original list converted to
	 * lower case and print them out.
	 */
	private static void exercise1() {
		List<String> list = Arrays.asList(
				"The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

		/* YOUR CODE HERE */
	}

	/**
	 * Exercise 2
	 *
	 * Modify exercise 1 so that the new list only contains strings that have an
	 * odd length
	 */
	private static void exercise2() {
		List<String> list = Arrays.asList(
				"The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");

		/* YOUR CODE HERE */
	}

	/**
	 * Exercise 3
	 *
	 * Join the second, third and forth strings of the list into a single
	 * string, where each word is separated by a hyphen (-). Print the resulting
	 * string.
	 */
	private static void exercise3() {
		List<String> list = Arrays.asList(
				"The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

		/* YOUR CODE HERE */
	}

	/**
	 * Count the number of lines in the file using the BufferedReader provided
	 */
	private static void exercise4() throws IOException {
		
//		FileHelper.getStreamFromFile(FileHelper.SONNET)
		
	}

	/**
	 * Create a list of words with no duplicates
	 * contained in the file. Print the words.
	 * 
	 * HINT: A regular expression, WORD_REGEXP, is already defined for your use.
	 */
	private static void exercise5() throws IOException {
		
//		FileHelper.getStreamFromFile(FileHelper.SONNET)
		
	}

	/**
	 * Create a list of words from the file, converted to lower-case
	 * and with duplicates removed, which is sorted by natural order.
	 * Print the contents of the list.
	 */
	private static void exercise6() throws IOException {

//		FileHelper.getStreamFromFile(FileHelper.SONNET)
		
	}

	/**
	 * Modify exercise 6 so that the words are sorted by length
	 */
	private static void exercise7() throws IOException {
		
//		FileHelper.getStreamFromFile(FileHelper.SONNET)
		
	}

	public static void main(String[] args) throws IOException {
		System.out.println("solution 1:");
		exercise1();
		System.out.println("solution 2:");
		exercise2();
		System.out.println("solution 3:");
		exercise3();
		System.out.println("solution 4:");
		exercise4();
		System.out.println("solution 5:");
		exercise5();
		System.out.println("solution 6:");
		exercise6();
		System.out.println("solution 7:");
		exercise7();
	}

}
