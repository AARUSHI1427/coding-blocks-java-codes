package trees;

public class binaryST {
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
	int size;
	binaryST(int... sortedArray){
		this.root=this.construct(sortedArray,0,sortedArray.length);
	}
	private Node construct(int[] sortedArray,int li,int si){
		if(si>li){
			return null;
		}
		int mid=(si+li)/2;
		Node node=new Node(sortedArray[mid],null,null);
		node.left=this.construct(sortedArray, li, mid-1);
		node.right=this.construct(sortedArray, mid+1, si);
		return node;
	}
	public binaryST() {
		this.root = null;
		this.size=0;
	}

	

	public int size() {
		return this.size;
	}

	public void add(int data) {
		if (this.root == null) {
			this.root = new Node(data, null, null);

		} else {
			add(this.root, data);
		}

	}

	private void add(Node node, int data) {

		if (node.data < data) {
			if (node.right != null) {
				add(node.right, data);
			} else {
				node.right = new Node(data, null, null);
				this.size++;
			}
		} else {
			if (node.data > data) {
				if (node.left != null) {
					add(node.left, data);
				} else {
					node.left = new Node(data, null, null);
					this.size++;
				}
			} else {

			}
		}

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>" + node.data);
		} else {
			System.out.print("END=>" + node.data);
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

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		int max = node.data;
		if (node.right != null) {
			max = max(node.right);
		}
		return max;
	}

	public int min() {
		return min(this.root);
	}

	private int min(Node node) {
		int min = node.data;
		if (node.left != null) {
			min = min(node.left);
		}
		return min;
	}

	public void boundary() {
		boundary(this.root);
	}

	private void boundary(Node node) {

	}

	public void remove(int data) {
		this.root = this.remove(this.root, data);
	}

	private Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (data < node.data) {
			node.left = this.remove(node.left, data);
			return node;

		} else if (data > node.data) {
			node.right = this.remove(node.right, data);
			return node;
		} else {
			if (node.left == null && node.right == null) {
				this.size--;
				return null;
			} else if (node.left == null) {
				this.size--;
				return node.right;
			} else if (node.right == null) {
				this.size--;
				return node.left;
			} else {
				int lmax = this.max(node.left);
				node.data = lmax;
				node.left = this.remove(node.left, lmax);
				return node;

			}
		}
	}
	public boolean isBST(binaryTree tree){
		return isBST(tree.root,tree);
	}
	private boolean isBST(Node node,binaryTree tree){
		if(node.left!=null){
			isBST(node.left);
			if(node.left.data<node.data){
				return true;
			}else{
				return false;
			}
			
		}
		if(node.right!=null){
			isBST(node.right);
			if(node.right.data>node.data){
				return true;
			}else{
				return false;
			}
		
		}
	}
	
}
