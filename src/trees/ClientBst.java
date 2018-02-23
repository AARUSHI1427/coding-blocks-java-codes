package trees;

public class ClientBst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        binaryST tree=new binaryST();
        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(12);
        tree.add(37);
        tree.add(62);
        tree.add(87);
        tree.add(49);
        tree.add(55);
        
        tree.display();
        System.out.println(tree.max());
        System.out.println(tree.min());
       tree.remove(25); 
        tree.display();
//        int[] arr={12,25,37,49,50,55,62,75,87};
//        isBST(tree);
//        tree.display();
	}

}
