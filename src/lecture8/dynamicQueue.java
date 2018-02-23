package lecture8;

public class dynamicQueue extends QueueUsingArrays {
	public dynamicQueue() throws Exception {
   	 this(DEFAULT_CAPACITY);
    }
    public dynamicQueue(int capacity)throws Exception{
      	 super(capacity);
       }
    public void enqueue(int item) throws Exception{
    	if(size()==data.length){
   		 int[] arr= new int[2*(data.length)];
   		 for(int i=0;i<this.size;i++){
   			 arr[i]=this.data[(this.front+i)%this.data.length];
   			 
   		 }
   		 this.front=0;
   		 this.data=arr;
   	 }
   		 super.enqueue(item);
    }
		
	
 
}
