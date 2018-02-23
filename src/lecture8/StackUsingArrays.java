package lecture8;

public class StackUsingArrays {
	protected int[] data;
	protected int tos;

	public static final int DEFAULT_CAPACITY = 10;

	public StackUsingArrays() throws Exception {

		this(DEFAULT_CAPACITY);
	}

	public StackUsingArrays(int capacity) throws Exception {
		if (capacity <= 0) {
			System.out.println("invalid capacity");
		}
		this.data = new int[capacity];
		this.tos = -1;

	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			System.out.println("Stack Overflow");
		}
		this.tos++;
		this.data[this.tos] = item;
	}

	public int pop() throws Exception {
//		if (this.isEmpty()) {
//			System.out.println("Stack Underflow");
//		}
		int retval = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return retval;
	}

	public int top() throws Exception {
		if (this.isEmpty()) {
			System.out.println("Stack Underflow");
		}
		
		return this.data[this.tos];
	}

	public void display() throws Exception {
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
		}
		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i] + ", ");
		}
		System.out.println("END");
	}
}
