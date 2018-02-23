package trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class gebericTree {

	private class Node {
		int data;
		ArrayList<Node> children;

		Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	Node root;
	int size = 0;

	gebericTree() {
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, 0);

	}

	public int size() {
		return this.size;
	}

	private Node takeInput(Scanner s, Node parent, int ithchild) {
		if (parent == null) {
			System.out.println("Enter data for root node");
		} else {
			System.out.println("Enter data for " + ithchild + "th child of tree");
		}
		int nodedata = s.nextInt();
		Node node = new Node(nodedata);
		this.size++;
		System.out.println("Enter the no of children for " + ithchild + "th child of " + nodedata);
		int nchildren = s.nextInt();
		for (int i = 0; i < nchildren; i++) {
			Node child = takeInput(s, node, i);
			node.children.add(child);
		}
		return node;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		System.out.print(node.data + "=>");
		for (int i = 0; i < node.children.size(); i++) {
			System.out.print(node.children.get(i).data + ",");
		}
		System.out.println("END");
		for (int i = 0; i < node.children.size(); i++) {
			this.display(node.children.get(i));
		}
	}

	public void max() {
		max(this.root);
	}

	private int max(Node node) {
		int maxm = node.data;
		for (int i = 0; i < node.children.size(); i++) {
			int maxchild = this.max(node.children.get(i));
			if (maxchild > maxm) {
				maxm = maxchild;
			}
		}
		return maxm;

	}

	public int height() {
		return this.height(this.root);

	}

	private int height(Node node) {
		int height = -1;
		for (int i = 0; i < node.children.size(); i++) {
			int heightchild = this.height(node.children.get(i));
			if (heightchild > height) {

				height = heightchild;
			}
		}
		height = height + 1;
		return height;
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		int rv = 0;
		for (int i = 0; i < node.children.size(); i++) {
			int childsize = this.size2(node.children.get(i));
			rv = rv + childsize;
		}
		rv = rv + 1;

		return rv;
	}

	public void find(int data) {
		find(this.root, data);
	}

	private boolean find(Node node, int data) {
		if (node.data == data) {
			return true;
		}
		for (int i = 0; i < node.children.size(); i++) {
			boolean isfoundinchild = this.find(node.children.get(i), data);
			if (isfoundinchild) {
				return true;
			}
		}
		return false;
	}

	public void printlevel(int level) {
		printlevel(level, this.root);
	}

	private void printlevel(int level, Node node) {
		if (level == 0) {
			System.out.println(node.data);
		}
		for (int i = 0; i < node.children.size(); i++) {
			this.printlevel(level - 1, node.children.get(i));
		}
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {
		for (int i = 0; i < node.children.size(); i++) {
			mirror(node.children.get(i));
		}
		int left = 0, right = node.children.size() - 1;
		while (left <= right) {
			Node temp = node.children.get(left);
			node.children.set(left, node.children.get(right));
			node.children.set(right, temp);
		}
	}
	public void preorder(){
		preorder(this.root);
		
	}
	private void preorder(Node node){
		System.out.print(node.data + ",");

		
		for (int i = 0; i < node.children.size(); i++) {
			this.preorder(node.children.get(i));
		}
		
	}
	public void post(){
		postorder(this.root);
	}
	private void postorder(Node node){
		for (int i = 0; i < node.children.size(); i++) {
			this.postorder(node.children.get(i));
			
		}
		System.out.print(node.data+",");
	}
	public void levelorder(){
		LinkedList<Node> queue=new LinkedList<>();
		queue.addLast(this.root);
		while(!queue.isEmpty()){
			 Node temp=queue.removeFirst();
			 System.out.println(temp.data);
			 for(int i=0;i<temp.children.size();i++){
				 queue.addLast(temp.children.get(i));
			 }
			 
		}
		
	}
	/*public int scndMax(){
		return scndMax(this.root,null,null);
	}
	private int scndMax(Node node,Node first,Node second){
		int secnd=0;
		for(int i = 0; i < node.children.size(); i++){
			if(node.data>first.data){
//				second=first;
//				first=root;
				 secnd=scndMax(node.children.get(i),node,first);
				
			}
			else if(node.data<first.data){
				 secnd=this.scndMax(node.children.get(i), first, node);
				
			}
		}
		return secnd;
	
		
	}*/
	public void justLar(int data){
		ArrayList<Integer> list = new ArrayList<>();
	  System.out.println(justLar(this.root,data,list));
	}
	
	private int justLar(Node node,int data,ArrayList<Integer> list){
		list.add(node.data);
		for(int i=0;i<node.children.size();i++){
			justLar(node.children.get(i),data,list);
		 
		}
		System.out.println(list);
		Collections.sort(list);
		
		int index=list.indexOf(data);
		if(index==list.size()-1){
			return list.get(index);
		}else{
			return list.get(index+1);
		}
	
	}

}
