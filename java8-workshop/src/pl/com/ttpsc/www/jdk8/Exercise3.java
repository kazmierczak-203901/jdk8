package pl.com.ttpsc.www.jdk8;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pl.com.ttpsc.www.jdk8.helper.FileHelper;

public class Exercise3 {

	private static final String WORD_REGEXP = "[- .:,]+";

	/**
	 * Exercise 0
	 *
	 * Get the longest word in the file using max()
	 * 
	 */
	private static void exercise0() throws IOException {

//		String longestWord = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(longestWord);
	}

	/**
	 * Exercise 1
	 *
	 * Get the longest word in the file using reduce()
	 * 
	 */
	private static void exercise1() throws IOException {

//		String longestWord = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(longestWord);
	}

	/**
	 * Exercise 2
	 *
	 * Get the length of the longest word in the file
	 * 
	 */
	private static void exercise2() throws IOException {

//		int maxLength = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))
//
//		System.out.print(maxLength);
	}

	/**
	 * Exercise 3
	 *
	 * Get the list of the shortest words in the file
	 * 
	 */
	private static void exercise3() throws IOException {

//		int shortestWordLength = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

//		List<String> shortestWords = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(shortestWords);
	}

	/**
	 * Exercise 4
	 *
	 * Get the number of words in the file
	 * 
	 */
	private static void exercise4() throws IOException {

//		long wordCount = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(wordCount);
	}

	/**
	 * Exercise 5
	 *
	 * Get the number of letters in the file
	 * 
	 */
	private static void exercise5() throws IOException {

//		long letterCount = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(letterCount);
	}

	/**
	 * Exercise 6
	 *
	 * Get the average word length in the file
	 * 
	 */
	private static void exercise6() throws IOException {

//		double average = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(average);
	}

	/**
	 * Exercise 7
	 *
	 * Get the number of occurrences of the word "luxemburg"
	 * 
	 */
	private static void exercise7() throws IOException {

//		long luxemburgCount = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(luxemburgCount);
	}

	/**
	 * Exercise 8
	 *
	 * Group the number of words per word length; For example: 30 words with
	 * length 4, 60 words with length 5, etc.
	 * 
	 */
	private static void exercise8() throws IOException {

//		Map<Integer, Long> numberOfWordsPerLength = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(numberOfWordsPerLength);
	}

	/**
	 * Exercise 9
	 *
	 * Group the number of occurrences of each character in the file For
	 * example: a = 4, b = 5, etc.
	 * 
	 */
	private static void exercise9() throws IOException {

//		Map<String, Long> numberOfLetterOccurrences = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.flatMap((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(numberOfLetterOccurrences);
	}

	/**
	 * Exercise 10
	 *
	 * Get the list with number of words in each line; For example: 100, 150,
	 * 120, etc.
	 * 
	 */
	private static void exercise10() throws IOException {

//		List<Long> wordsInLines = FileHelper.getStreamFromFile(FileHelper.LINES)
//				.map((String line) -> Stream.of(line.split(SPLIT_REGEX)))

		/* YOUR CODE HERE */

//		System.out.print(wordsInLines);
	}
	
	public static void main(String[] args) throws IOException {

		System.out.print("solution 0: ");
		exercise0();
		System.out.println();
		System.out.print("solution 1: ");
		exercise1();
		System.out.println();
		System.out.print("solution 2: ");
		exercise2();
		System.out.println();
		System.out.print("solution 3: ");
		exercise3();
		System.out.println();
		System.out.print("solution 4: ");
		exercise4();
		System.out.println();
		System.out.print("solution 5: ");
		exercise5();
		System.out.println();
		System.out.print("solution 6: ");
		exercise6();
		System.out.println();
		System.out.print("solution 7: ");
		exercise7();
		System.out.println();
		System.out.print("solution 8: ");
		exercise8();
		System.out.println();
		System.out.print("solution 9: ");
		exercise9();
		System.out.println();
		System.out.print("solution 10: ");
		exercise10();

	}

}
