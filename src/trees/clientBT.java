package trees;

public class clientBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//18 true 24 true 48 false false true 10 false false true 39 true 46 false false false
		 binaryTree tree=new binaryTree();
	    tree.display();
	    tree.traversal(tree.root);
	    
	   //  System.out.println(tree.lca(48, 46));
	}

}
