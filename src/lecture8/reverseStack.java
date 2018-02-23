package lecture8;

public class reverseStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		dynamicStack stack = new dynamicStack(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		String str = "(a+b)";
		System.out.println(isBalanced(str));
		dynamicStack helper = new dynamicStack(5);
		stack.display();
		// reverseStack(stack,helper,0);
		stack.display();

		dynamicQueue queue = new dynamicQueue();
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			// displayQueueInfo(queue);
		}
		 reverseQueue(queue,0);
		 queue.display();
	}

	 public static void reverseStack(dynamicStack stack,dynamicStack
	 helper,int index) throws Exception
	 {
	
	 int item=stack.pop();
	 reverseStack(stack,helper,index+1);
	 helper.push(item);
	 if(index==0){
	 while(!helper.isEmpty()){
	 stack.push(helper.pop());
	 }
	 }
	 }
	public static void reverseQueue(dynamicQueue queue, int index) throws Exception {
		// TODO Auto-generated method stub
		if (queue.isEmpty()) {
			return;
		}
		int item1 = queue.dequeue();
		reverseQueue(queue, index + 1);
		queue.enqueue(item1);
	}

	public static boolean isBalanced(String str) throws Exception {
		dynamicStack stack = new dynamicStack();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
				stack.push(i);

			} else {
				if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
					if (!stack.isEmpty()) {
						if (str.charAt(i) == ')' && (char)stack.top() == '(') {
							stack.pop();
						} else {
							if (str.charAt(i) == '}' && (char)stack.top() == '{') {
								stack.pop();
							} else {
								if (str.charAt(i) == ']' && (char)stack.top() == '[') {
									stack.pop();
								}else{
									
								}
							}
						}

					} else {
						return false;
					}
				}

			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
	

}
