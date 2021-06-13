package datastructure.stack;

/**
 * 
 * @author Sanobar Mujawar
 * Created_On: 13.06.21
 *
 *Purpose: To perform stack operations on data 
 */


/**
 * UC-1 & UC-2 stack operations
 */
public class Stack {

		int stack[] = new int[5];
		int top = 0;

		public void push(int data) {
			if(isFull()) {
				System.out.println("Stack is overflow");
			}else {
				stack[top] = data;
				top++;
			}
			
		}

		//Pop element from stack
		public int pop() {
			int data=0;
			if(isEmpty()) {
				System.out.println("Stack is underflow");
			}else {
				top--;
				data = stack[top];
				stack[top] = 0;
				return data;
			}
			
			return data;
		}

		//peek  element to perform operation
		public int peek() {
			int data;
			data = stack[top - 1];
			return data;
		}

		//to print stack
		public void show() {
			for (int num : stack) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		//to get size of stack
		public int size() {
			return top;
		}
		
		public boolean isFull() {
			return top==stack.length;
		}
		public boolean isEmpty() {
			return top==0;
		}
	

		//main
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Stack stack = new Stack();
			stack.push(70);
			stack.push(30);
			stack.push(56);
			stack.show();
			System.out.println(stack.peek() + "peek");
			System.out.println("\n" + stack.pop() + "pop");
			System.out.println(stack.peek() + "peek");
			System.out.println("\n" + stack.pop() + "pop");
			System.out.println(stack.peek() + "peek");
			System.out.println("\n" + stack.pop() + "pop");
			
			stack.pop();
			stack.show();
		}

}

