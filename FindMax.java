
/**
 * 
 * @author Sanobar Mujawar
 * Created_On: 11.06.21
 * 
 * Purpose: To  find maximum of to numbers, strings, double using java Generics 
 * 
 */

package javaGenerics;

/**
 * Refactor-2 created generic class eith parameter constructor extends comparable
 * @param <E>
 */

public class FindMax<E extends Comparable<E>> {
	E[] values;

	public FindMax(E[] values) {
		this.values = values;
	}

	public static <E> void printMax(E max) {
		System.out.println("Max Value = " + max);
	}

	public static void main(String[] args) {
		Integer[] integerValues = { 50, 20, 300 };
		String[] stringValues = { "All", "Good", "Morning" };
		new FindMax<String>(stringValues).findMaxValue();
		new FindMax<Integer>(integerValues).findMaxValue();
	}

	public E findMaxValue() {
		if (values[0].compareTo(values[1]) > 0 && values[0].compareTo(values[2]) > 0) {
			printMax(values[0]);
			return values[0];
		} else if (values[1].compareTo(values[0]) > 0 && values[1].compareTo(values[2]) > 0) {
			printMax(values[1]);
			return values[1];
		} else {
			printMax(values[2]);
			return values[2];
		}
	}
}