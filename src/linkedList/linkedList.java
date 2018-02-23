


package linkedList;

import linkedList.linkedList.Node;

public class linkedList {
	public class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	Node head;
	Node tail;
	int size;

	linkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public int size() {
		return this.size;
	}

	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(int data) {
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		}
		this.tail.next = node;
		this.tail = node;

		this.size++;
	}

	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size()) {
			throw new Exception("Invalid Index");
		}
		int counter = 0;
		Node temp = this.head;
		while (counter < index) {
			temp = temp.next;
			counter++;
		}
		return temp;
	}

	public void addAt(int data, int index) throws Exception {
		if (index < 0 || index > this.size()) {
			throw new Exception("Invalid Index");
		}
		if (index == 0) {
			addFirst(data);
		} else {
			if (index == size) {
				addLast(data);
			} else {
				Node temp = getNodeAt(index - 1);
				Node node = new Node(data, temp.next);
				temp.next = node;
				this.size++;
			}
		}

	}

	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}
		return this.tail.data;
	}

	public int getAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}
		if (index < 0 || index >= this.size()) {
			throw new Exception("Invalid Index");
		}
		if (index == 0) {
			return getFirst();
		} else {
			if (index == size() - 1) {
				return getLast();
			} else {
				return getNodeAt(index).data;
			}
		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void removefirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
	}

	public void removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node temp = getNodeAt(size() - 2);
			temp.next = null;
			this.tail = temp;
		}
		this.size--;
	}

	public void removeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}
		if (index == 0) {
			removefirst();
		} else {
			if (index == size() - 1) {
				removeLast();
			} else {
				Node temp = getNodeAt(index - 1);
				temp.next = temp.next.next;
				this.size--;
			}
		}

	}

	public void reverseDI(linkedList list) throws Exception {
		Node left = this.head;
		Node right = getNodeAt(size() - 1);
		for (int i = 2; left.next != right.next; i++) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			left = left.next;
			right = getNodeAt(size() - i);
		}

	}
	public void reversePI(linkedList list){
		Node prev=this.head,curr=this.head.next;
		while(curr!=null){
			Node tempPrev=prev;
			Node tempCurr=curr;
			
			
		}
	}
	public int mid(int N) throws Exception {
        int ans=0;
		if(N%2==0){
		   ans= getNodeAt(N/2).data; 
		}else{
		  ans= getNodeAt(N/2+1).data;
		}
		return ans;
	}
	 public void evenAfOdd(linkedList list){
		    Node prev=head;
		    Node curr=head.next;
		    
		    while(curr!=null){
		        if(curr.data%2!=0){
		            Node temp1=curr;
		            curr=curr.next;
		            temp1.next=head;
		            head=temp1;
		            prev.next=curr;
		            		  
		        }else{
		        	prev=prev.next;
		        	curr=curr.next;
		        }
		        
		    }
		}
	 public void kReverse(int n,int k,int li) throws Exception {
	      int i;
	      for(i=li;i<li+k;i++){
	          if(i==n){
	              break;
	          }
	      }
	      System.out.println(i);
	      int ri=i-1;
	    
		while (li <= ri) {
				Node left =getNodeAt(li);
				Node right =getNodeAt(ri);

				int temp = left.data;
				left.data = right.data;
				right.data = temp;
				li++;
				ri--;

			}
			if(i!=n){
			    kReverse(n,k,i);
			}
		}
	 public static void SelectionLL(linkedList list,int n){
			Node temp1=list.head;
			
			
			for(int i=0;i<n-1;i++){
				Node min=temp1;
				Node temp2=temp1.next;
				for(int j=i+1;j<n;j++){
					if(min.data>temp2.data){
						min=temp2;
						temp2=temp2.next;
					}
				}
				int temp = min.data;
				min.data = temp1.data;
				temp1.data = temp;
				temp1=temp1.next;
			}
		}
	
}
