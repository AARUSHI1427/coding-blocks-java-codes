package treePrac;

public class BST {

	public class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

	}

	Node root;
	int size;

	BST() {
		this.root = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public void add(int data) {
		if (this.root == null) {
			this.root = new Node(data, null, null);
			this.size++;
		} else {
			this.add(this.root, data);
		}

	}

	private void add(Node node, int data) {
		if (node.data < data) {
			if (node.right != null) {
				this.add(node.right, data);
			} else {
				node.right = new Node(data, null, null);
				this.size++;
			}

		} else if (node.data > data) {
			if (node.left != null) {
				this.add(node.left, data);
			} else {
				node.left = new Node(data, null, null);
				this.size++;
			}
		} else {

		}
	}

	public void remove(int data) {
		this.root = this.remove(data, this.root);
	}

	private Node remove(int data, Node node) {
		if (node == null) {
			return null;
		}
		if (data < node.data) {
			node.left = this.remove(data, node.left);
			return node;
		} else if (data > node.data) {
			node.right = this.remove(data, node.right);
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
				int lmax = max(node.left);
				node.data = lmax;
				node.left = this.remove(lmax, node.left);
				return node;
			}
		}
	}
}
