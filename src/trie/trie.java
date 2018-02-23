package trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class trie {
	public class Node {
		Character data;
		HashMap<Character, Node> children;
		boolean isTerminal;

		Node(char data, boolean isTerminal) {
			this.data = data;
			this.children = new HashMap<>();
			this.isTerminal = false;
		}
	}

	private Node root;
	private int numWords;

	trie() {
		this.root = new Node('\0', false);
		this.numWords = 0;
	}

	public void add(String word) {
		this.add(this.root, word);
	}

	private void add(Node node, String word) {
		if (word.length() == 0) {
			if (node.isTerminal) {

			} else {
				node.isTerminal = true;
				this.numWords++;
			}
			return;
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		if (node.children.containsKey(cc)) {
			add(node.children.get(cc), ros);
		} else {
			Node child = new Node(cc, false);
			node.children.put(cc, child);
			add(node.children.get(cc), ros);
		}
	}

	public void display() {
		this.display(this.root, "");
	}

	private void display(Node node, String osf) {
		if (node.isTerminal) {
			String toPrint = osf.substring(1) + node.data;
			System.out.println(toPrint);
		}
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			this.display(entry.getValue(), osf + node.data);
		}

	}

	public boolean search(String word) {
		return search(this.root, word);
	}

	private boolean search(Node node, String word) {
		if (word.length() == 0) {
			if (node.isTerminal) {
				return true;
			} else {
				return false;
			}
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		if (!node.children.containsKey(cc)) {
			return false;
		}
		return search(node.children.get(cc), ros);
	}

	public void remove(String word) {
		this.remove(this.root, word);
	}

	private void remove(Node parent, String word) {
		if (word.length() == 0) {
			if (parent.isTerminal) {
				parent.isTerminal = false;
			} else {

			}
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) {
			return;
		}
		this.remove(child, ros);
		if (parent.isTerminal && parent.children.size() == 0) {
			// this.remove(cc);
		}
	}

	
}
