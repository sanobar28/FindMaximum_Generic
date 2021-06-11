
/**
 * 
 * @author Sanobar Mujawar
 * Created_On: 11.06.21
 * 
 * Purpose: To  find maximum of to numbers, strings, double using java Generics 
 * 
 */

package javaGenerics;


public class FindMax {

	public Integer findMaxValue(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		Integer max = firstNumber;
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		printMax(max);
		return max;
	}

	/**
	 * UC-2 to find max method returns maximum value using Float object and
	 * compareTo method
	 *
	 */
	public Float findMaxValue(Float firstNumber, Float secondNumber, Float thirdNumber) {
		Float max = firstNumber;
		if (secondNumber.compareTo(max) > 0) {
			max = secondNumber;
		}
		if (thirdNumber.compareTo(max) > 0) {
			max = thirdNumber;
		}
		printMax(max);
		return max;
	}

	private void printMax(Integer max) {
		System.out.println("Largest = " + max);
	}

	private void printMax(Float max) {
		System.out.println("Largest = " + max);
	}
}
