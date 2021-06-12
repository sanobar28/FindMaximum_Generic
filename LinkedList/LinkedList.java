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
		 * UC-1  Method to insert element in link list
		 * @param node
		 */
		public void insert(LinkedListNode<T> node) {
			node.setNext(first);
			first = node;
		}
			

		/**
		 * UC-2 Recursively traverse this list and print the node value
		 * @param node
		 */
		private void printList(LinkedListNode<T> node) {
			System.out.println("Node is " + node.getValue());
			if(node.getNext()!=null) printList(node.getNext());
		}

		public void print(){
			printList(first);
		}
		
		public static void main(String[] args) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.insert(new LinkedListNode<Integer>(56));
			list.insert(new LinkedListNode<Integer>(30));
			list.insert(new LinkedListNode<Integer>(70));
			
			list.print();
		}

}
