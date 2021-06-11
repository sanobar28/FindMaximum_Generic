
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
	/**
	 * Refactor 1- Generic Method to Find the Max Value of passed Arguments
	 */
	 public <E extends Comparable> E findMaxValue(E firstValue, E secondValue, E thirdValue){
	     E max = firstValue;
	     if (secondValue.compareTo(max) > 0) {
	         max = secondValue;
	     }
	     if (thirdValue.compareTo(max) > 0) {
	         max = thirdValue;
	     }
	     printMax(max);
	     return max;
	 }
	 
	 public <E> void printMax(E max){
	     System.out.println("Max Value = "+max);
	 }
 }
