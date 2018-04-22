package pl.com.ttpsc.www.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Exercise1 {

	/**
	 * Exercise 1
	 *
	 * Create a string that consists of the first letters of each word in the
	 * list of Strings provided.
	 */
	private static void exercise1() {
		List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

		/* YOUR CODE HERE */
	}

	/**
	 * Exercise 2
	 *
	 * Remove the words that have odd lengths from the list.
	 */
	private static void exercise2() {
		List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

		/* YOUR CODE HERE */
	}

	/**
	 * Exercise 3
	 *
	 * Replace every word in the list with its upper case equivalent.
	 */
	private static void exercise3() {
		List<String> list = new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

		/* YOUR CODE HERE */
	}

	/**
	 * Exercise 4
	 *
	 * Convert every key-value pair of the map into a string and append them all
	 * into a single string, in iteration order.
	 */
	private static void exercise4() {
		Map<String, Integer> map = new TreeMap<>();
		map.put("c", 3);
		map.put("b", 2);
		map.put("a", 1);

		/* YOUR CODE HERE */
	}

	/**
	 * Exercise 5
	 *
	 * Create a new thread that prints the numbers from the list.
	 */
	private static void exercise5() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		/* YOUR CODE HERE */
	}

	/**
	 * Main entry point for application
	 *
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
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
	}

}
