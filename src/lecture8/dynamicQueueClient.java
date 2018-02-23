package lecture8;

public class dynamicQueueClient {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 QueueUsingArrays queue=new dynamicQueue(5);
	     for(int i=1;i<=5;i++){
	    	 queue.enqueue(i*10);
	    	 displayQueueInfo(queue);
	     }
	     for(int i=1;i<=5;i++){
	    	 queue.enqueue(i*100);
	    	 displayQueueInfo(queue);
	     }
	     queue.dequeue();
	     queue.dequeue();
	     queue.enqueue(60);
	     queue.enqueue(70);
	     displayQueueInfo(queue);
	     while(!queue.isEmpty()){
	    	 displayQueueInfo(queue);
	    	 queue.dequeue();
	 
	     }
	     
		}
		public static void displayQueueInfo(QueueUsingArrays queue)throws Exception{
			System.out.println("******************");
			queue.display();
			System.out.println(queue.size()); 
			System.out.println(queue.front());
			System.out.println("******************");
			
			
	}
}
