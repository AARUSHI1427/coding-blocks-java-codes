package trees;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class binaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	Node root;
	int size = 0;

	public binaryTree() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);

	}
	public int size() {
		return this.size;
	}

	public Node takeInput(Scanner s, Node parent, boolean isleftorRight) {
		if (parent == null) {
			System.out.println("Enter data for root node");
		} else {
			if (isleftorRight) {
				System.out.println("Enter data for left child of " + parent.data);
			} else {
				System.out.println("Enter data for right child of " + parent.data);
			}
		}

		int nodedata = s.nextInt();
		Node node = new Node(nodedata, null, null);
		this.size++;
		boolean choice = false;
		System.out.println("Do you have a left child for " + node.data);
		choice = s.nextBoolean();
		if (choice) {

		  node.left = takeInput(s, node, true);
		}
		choice = false;
		System.out.println("Do you have right child for " + node.data);
		choice=s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);
			
		}
		
		return node;

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>"+node.data);
		} else {
			System.out.print("END=>"+node.data);
		}
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (node.left != null) {
			this.display(node.left);
		}
		if (node.right != null) {
			this.display(node.right);
		}

	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			int height = -1;
		}

		int heightl = this.height(node.left);
		int heightr = this.height(node.right);
		int sum = 0;
		if (heightl > heightr) {
			sum = heightl + 1;
		} else {
			sum = heightr + 1;
		}
		return sum;

	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int x = this.size2(node.left);
		int y = this.size2(node.right);
		return x + y + 1;
	}

	public boolean find(int data) {
		return this.find(this.root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		}
		if (this.find(node.left, data)) {
			return true;
		} else {
			if (this.find(node.right, data)) {
				return true;
			} else {
				return false;
			}
		}

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int maxm = node.data;
		int leftmax = max(node.left);
		int rightmax = max(node.right);
		int childmax = (leftmax > rightmax) ? leftmax : rightmax;
		return (maxm > childmax) ? maxm : childmax;
	}

	public void preorder() {
		this.preorder(this.root);
	}

	private void preorder(Node node) {
         Stack<Node> stack=new Stack<Node>();
         while(!stack.isEmpty()){
        	 Node a=stack.pop();
        	 System.out.println(a);
        	 if(a.right!=null){
        		 stack.push(a.right);
        	 }
        	 if(a.left!=null){
        		 stack.push(a.left);
        	 }
        	 
         }
	}
	public void preOrderIterative() {
		LinkedList<Node> stack = new LinkedList<>();
		stack.addFirst(this.root);
		while (!stack.isEmpty()) {
			Node curr = stack.removeFirst();
			System.out.print(curr.data + "\t");
			if (curr.right != null) {
				stack.addFirst(curr.right);
			}
			if (curr.left != null) {
				stack.addFirst(curr.left);
			}
		}
	}
	public int lca(int d1,int d2){
		return this.lca(this.root,d1,d2);
	}
	private int lca(Node node,int d1,int d2){
		int par1=0,par2=0;
		if (node.data == d1) {
			return node.data;
		}
		//searching d1
		if (this.find(node.left, d1)) {
			 par1=node.left.data;
			return par1;
		} 
		if (this.find(node.right, d1)) {
		     par1=node.right.data;
			return par1;
			} 
		//searching d2
		if (node.data == d2) {
			return node.data;
		}
		if (this.find(node.left, d2)) {
			 par2=node.left.data;
			return par2;
		} 
		if (this.find(node.right, d2)) {
		     par2=node.right.data;
			return par2;
			} 
		//finding lca
		if(par1==par2){
			return par1;
		}else{
			return lca(node,par1,par2);
		}
			
		
	}
	public void traversal(Node node){
		if(node!=null){
			System.out.println(node.data);
			traversal(node.left);
			traversal(node.right);
		}
	}
}
