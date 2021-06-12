/**
 * 
 * @author Sanobar Mujawar
 * Created_On: 12.06.21
 * 
 * Purpose: To create and perform LinkedList operations
 * 
 */



package datastructure.java;

public class LinkedList<T> {
	

		private LinkedListNode<T> first = null;
		
		/**
		 * Method to insert element in link list
		 * @param node
		 */
		public void insert(LinkedListNode<T> node) {
			node.setNext(first);
			first = node;
		}
		
		
		public static void main(String[] args) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.insert(new LinkedListNode<Integer>(56));
			list.insert(new LinkedListNode<Integer>(30));
			list.insert(new LinkedListNode<Integer>(70));
			
		}

}
