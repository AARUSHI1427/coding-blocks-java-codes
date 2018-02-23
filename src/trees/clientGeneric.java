package trees;

public class clientGeneric {
   public static void main(String[] arg){
	   gebericTree tree=new gebericTree();
	  //50 3 40 2 20 0 15 0 80 0 10 1 19 0
	   tree.display();
	   
	   //tree.max();
	   tree.printlevel(2);
	   System.out.println(tree.size());
	   System.out.println("*********");
	   tree.preorder();
	   System.out.println("**********");
	   tree.post();
	   System.out.println("**********");
	   tree.levelorder();
	   tree.justLar(15);
	 //  System.out.println(tree.scndMax());
   }
}
