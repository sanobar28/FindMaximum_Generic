
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
    
    static //List of Generic Values
    List<E> items = new LinkedList<>();
   

    //Constructor to Initialize Generic Array
    public  FindMax(E[] values) {
        this.values = values;
    }

    public static <E> void printMax(E max) {
        System.out.println("Max Value = " + max);
    }
    
    public FindMax(List<E> items) {
    	this.items = items;   
    }
    
    //Method to Find  Max Value From List
    public static Integer findMax() {
        return Collections.max(items);
    }
    
    
    public static void main(String[] args) {
    	
        Integer[] integerValues = {50, 20, 300};
        String[] stringValues = {"All", "Good", "Morning"};
        Double [] floatValues = {45.17, 577.4, 27.28};

        new FindMax<String>(stringValues).findMaxValue();
        new FindMax<Integer>(integerValues).findMaxValue();
        new FindMax<Double>(floatValues).findMaxValue();
        
        findMax();
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