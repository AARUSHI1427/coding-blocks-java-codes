package linkedList;

public class CLIENT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    linkedList list=new linkedList();
    list.addFirst(40);
    list.addFirst(180);
    list.addLast(70);
    list.addLast(40);
    list.addAt(15, 1);
    //list.removeLast();
   list.display();
   System.out.println("**********");
//    list.reverseDI(list);
//    list.display();
    //list.evenAfOdd(list);
    list.kReverse(list.size(), 3, 0);
    list.display();
    list.SelectionLL(list, 5);
    list.display();
	}

}
