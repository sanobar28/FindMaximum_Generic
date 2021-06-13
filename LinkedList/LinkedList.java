/**
 * 
 * @author Sanobar Mujawar
 * Created_On: 12.06.21
 * 
 * Purpose: To create and perform LinkedList operations
 * 
 */

package datastructure.java;

import java.util.Scanner;

public class LinkedList<T> {

	LinkedListNode<T> head;
	private LinkedListNode<T> first = null;

	/**
	 * UC-1 Method to insert element in link list
	 * 
	 * @param node
	 */
	public void insert(LinkedListNode<T> node) {
		node.setNext(first);
		first = node;
	}

	/**
	 * UC-2 Recursively traverse this list and print the node value
	 * 
	 * @param node
	 */
	private void printList(LinkedListNode<T> node) {
		System.out.println("Node is " + node.getValue());
		if (node.getNext() != null)
			printList(node.getNext());
	}
	
	
	/**
	 * UC-5 Remove from the front of the list
	 * @param node
	 */
	public void remove(){
		if(first.getNext()!=null)
			first = first.getNext();
		else first = null;
	}
	
	/**
	 * UC-6 to delete node at required index
	 * @param index
	 */
	public void deleteAt(int index) {
		if (index == 0) {
			first = first.getNext();
		} else {
			LinkedListNode<T> n = first;
			LinkedListNode<T> n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}
			n1 = n.getNext();
			n.setNext(n1.getNext());
			System.out.println("Node deleted is: " + n1.getValue());
			n1 = null;
		}
	}
	
	/**
	 * UC-7 to search value in linked list 
	 * @param node
	 * @return
	 */
	
	public int searchVal(T node) {
		LinkedListNode<T> currNode = first;
		int index = 0;
		if (null != currNode) {
			while ((null != currNode.getNext()) || (null != currNode.getValue())) {
				if (currNode.getValue() == node) {
					System.out.println("Element " + currNode.getValue() + " found!");
					break;
				}
				currNode = currNode.getNext();
				if (null == currNode) {
					return -1;
				}
				index++;
			}
		}
		return index;

	}
	
	/**
	 * UC-8 To insert value at given index
	 * @param index
	 * @param data
	 */
	public void insertAt(int index, LinkedListNode<T> data) {
		LinkedListNode<T> currNode = data;
		if (index == 0) {
			currNode= currNode.getNext();
		} else {
			LinkedListNode<T> newNode= data;
			LinkedListNode<T> nodeAtPreviousIndex = first;
			for (int i = 0; i < index - 1; i++) {
				nodeAtPreviousIndex = nodeAtPreviousIndex.getNext();
			}
			newNode.setNext(nodeAtPreviousIndex.getNext());
			nodeAtPreviousIndex.setNext(newNode);
		}
	}

	public void print() {
		printList(first);
	}
	
	/**
	 * UC-3 & UC-4 to insert elements at desired positions
	 * @param args
	 */

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(new LinkedListNode<Integer>(70));
		list.insert(new LinkedListNode<Integer>(30));
		list.insert(new LinkedListNode<Integer>(56));
		
		list.insertAt(2, new LinkedListNode<Integer>(40));
		list.searchVal(30);
		//list.deleteAt(2);
		list.print();
	}

	
}
