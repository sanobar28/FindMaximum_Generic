
/**
 * 
 * @author Sanobar Mujawar
 * Created_On: 11.06.21
 * 
 * Purpose: To  find maximum of to numbers, strings, double using java Generics 
 * 
 */

package javaGenerics;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * UC-4 find max method extends more than three parameters
 * @param <E>
 */

public class FindMax<E extends Comparable<E>> {
    E[] values;
    

    //Constructor to Initialize Generic Array
    @SafeVarargs
	public FindMax(E... values) {
        this.values = values;
    }

    public static <E> void printMax(E max) {
        System.out.println("Max Value = " + max);
    }
   
    public static void main(String[] args) {
    
        Integer[] integerValues = {50, 20, 300};
        String[] stringValues = {"All", "Good", "Morning"};
        Double [] floatValues = {45.17, 577.4, 27.28};

        new FindMax<String>(stringValues).findMaxValue();
        new FindMax<Integer>(integerValues).findMaxValue();
        new FindMax<Double>(floatValues).findMaxValue();
        
    }
    
    /**
     * using sort for sorting generic array
     * @return
     */

    public E findMaxValue() {
    	if (values.length == 0) {
            System.out.println("No values");
        } else {
            Arrays.sort(values);
            printMax(values[values.length - 1]);
            return values[values.length - 1];
        }
    }
    
    /*
     *Method to print Max Value
     * @param is Generic Value
     */
    public void printMax(E value) {
        System.out.println("Max Value = " + value);
    }
    
    
    }
}