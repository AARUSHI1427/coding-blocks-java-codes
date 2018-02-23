package lecture8;

public class QueueUsingArrays {
	protected int[] data;
	protected int size;
	protected int front;

	public static final int DEFAULT_CAPACITY = 10;

	public QueueUsingArrays() throws Exception {

		this(DEFAULT_CAPACITY);
	}

	public QueueUsingArrays(int capacity) throws Exception {
		if (capacity <= 0) {
			System.out.println("invalid capacity");
		}
		this.data = new int[capacity];
		this.size = 0;
		this.front = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			System.out.println("Queue is full");
		}

		int ai = (this.size + this.front) % this.data.length;
		this.data[ai] = item;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		int retval = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		this.size--;
		return retval;
	}

	public int front() throws Exception {
		if (size() == 0) {
			throw new Exception("Stack Underflow");
		}
		int retval = this.data[this.front];
		return retval;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int ai = (this.front + i) % this.data.length;
			System.out.print(this.data[ai] + ", ");
		}
		System.out.println("END");
	}

}
