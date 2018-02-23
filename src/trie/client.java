package trie;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    trie Trie=new trie();
    Trie.add("art");
    Trie.add("arts");
    Trie.add("boy");
    Trie.add("bug");
    Trie.add("see");
    Trie.add("sea");
    Trie.display();
    System.out.println(Trie.search("art"));
    
   
}
	 public static int patternMatch(String str, String search) {
			for (int i = 0; i < str.length(); i++) {
				int j=0;
				for ( j = 0; j < search.length(); j++) {
					if (search.charAt(j) != str.charAt(i+j)) {
	                    break;
					}
				}
				if(j==search.length()){
					return i;
				}
			}
	         return -1;
		}
}
