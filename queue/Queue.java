/**
 * 
 * @author Sanobar Mujawar
 * Created_On: 13.06.21
 *
 *Purpose: To perform queue operations on data 
 */


package datastructure.queue;

public class Queue<T> {

	private Object queue[] = new Object[50];
	int front = 0;
	int rear = 0;
	int size = 0;
	
	/**
	 * UC-3 to enqueue element in queue
	 * @param data
	 */
	public void enqueue(T data) {
		if (rear == 50) {
			System.out.println("Queue is full");
		} else {
			queue[rear] = data;
			rear++;
			size++;
		}

	}

	/**
	 * UC-4 to dequeue element from queue
	 * @return
	 */
	public Object dequeue() {
		Object data = queue[front];
		front++;
		rear--;
		size--;
		return data;
	}

	public boolean isEmpty() {
		if (rear == 0) {
			return true;
		}

		return false;

	}
	
	/**
	 * To get size to queue
	 * @return
	 */
	public int size() {
		return rear;
	}

	public void show() {
		for (int i = 0; i < rear; i++) {
			System.out.println(queue[front + i]);
		}

	}

	//main
	public static void main(String args[]) {
		Queue<Integer> q = new Queue<>();
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		q.enqueue(80);
		System.out.println("Size of Queue  " + q.size());
		q.show();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		System.out.println("=========");
		q.show();
		System.out.println(q.isEmpty());
	}

}
