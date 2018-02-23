package lecture8;

public class dynamicStack extends StackUsingArrays {
     public dynamicStack() throws Exception {
    	 this(DEFAULT_CAPACITY);
     }
     public dynamicStack(int capacity) throws Exception{
    	 super(capacity);
     }
     public void push(int item)throws Exception{
    	 if(size()==data.length){
    		 int[] arr= new int[2*(data.length)];
    		 for(int i=0;i<data.length;i++){
    			 arr[i]=data[i];
    			 
    		 }
    		 data=arr;
    	 }
    		 super.push(item);
    	 
     }
     public int pop() throws Exception{
    	 if(size()==(data.length)/4){
    		 int[] arr= new int[(data.length)/2];
    		 for(int i=0;i<arr.length;i++){
    			 arr[i]=data[i];
    			 
    		 }
    		 data=arr;
    	 }
    	 return super.pop();
     }
     
}
