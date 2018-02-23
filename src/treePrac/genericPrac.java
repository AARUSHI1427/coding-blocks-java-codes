package treePrac;

import java.util.ArrayList;
import java.util.Scanner;

public class genericPrac {
   
	private class Node{
		int data;
		ArrayList<Node> children;
		
		Node(int data){
			this.data=data;
			this.children=new ArrayList<>();
		}
	}
		Node root;
		int size=0;
		
		genericPrac(){
			Scanner s=new Scanner(System.in);
			this.root=takeInput(s,null,0);
		}
		
	public int size(){
		return this.size;
	}
	public Node takeInput(Scanner s,Node parent,int ithchild){
		if(parent==null){
			System.out.println("Enter data for root node");
		}
		else{
			System.out.println("Enter data for "+ithchild+"th of "+parent.data);
		}
		
		int nodedata=s.nextInt();
		Node node=new Node(nodedata);
		System.out.println("How many children for " +nodedata+"?");
		int nochildren=s.nextInt();
		for(int i=0;i<nochildren;i++){
			Node child=takeInput(s, node, i);
			node.children.add(child);
		}
		return node;
	}
	public void display(){
		this.display(this.root);
		
	}
	private void display(Node node){
		System.out.print(node.data+"=>");
		for(int i=0;i<node.children.size();i++){
			System.out.print(node.children.get(i).data+",");
		}
		System.out.println("END");
		for(int i=0;i<node.children.size();i++){
			this.display(node.children.get(i));
		}
	}
}
