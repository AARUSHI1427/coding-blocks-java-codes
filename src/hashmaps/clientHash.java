package hashmaps;



public class clientHash {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashTable<String,Integer> Map= new HashTable<>(5);
		Map.put("usa",200);
		Map.put("india",225);
		Map.put("rsa",150);
		Map.put("china",300);
		Map.put("russia",250);
		Map.display();
	}

}
