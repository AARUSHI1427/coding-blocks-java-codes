package lecture5;

import java.util.ArrayList;

public class recursionprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list=getSS("abc");
		 System.out.println(list);
		//System.out.println(getSSasci("ab"));
		// System.out.println(getBoardPath(0,10));
		// System.out.println(printpermu("abc",""));
		printSS("abc","");
		//System.out.println(getPermutations("abc"));
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> mylist = new ArrayList<>();
		ArrayList<String> recResult = getSS(ros);
		for (int i = 0; i < recResult.size(); i++) {
			mylist.add(recResult.get(i));
			mylist.add(cc + recResult.get(i));
		}
		return mylist;

	}

	public static ArrayList<String> getSSasci(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}
		char cc = str.charAt(0);

		String ros = str.substring(1);
		ArrayList<String> mylist = new ArrayList<>();
		ArrayList<String> recResult = getSS(ros);
		for (int i = 0; i < recResult.size(); i++) {
			mylist.add(recResult.get(i));
			mylist.add(cc + recResult.get(i));
			mylist.add((int) cc + recResult.get(i));
		}
		return mylist;
	}

	 public static ArrayList<String> getPermutations(String str){
		 if (str.length() == 0) {
				ArrayList<String> baseResult = new ArrayList<>();
				baseResult.add("");
				return baseResult;
			}
			char cc = str.charAt(0);
			String ros = str.substring(1);
			ArrayList<String> mylist = new ArrayList<>();

			ArrayList<String> recResult = getPermutations(ros);
			for (int i = 0; i < recResult.size(); i++) {
				String recString = recResult.get(i);
				for (int j = 0; j <= recString.length(); j++) {
					String myString = recString.substring(0, j) + cc + recString.substring(j);
					mylist.add(myString);
				}
			}
			return mylist;
	 }
	public static ArrayList<String> getBoardPath(int curr, int end) {
		if (end == curr) {
			ArrayList<String> baseResult = new ArrayList<>();
			baseResult.add("");
			return baseResult;
		}

		if (curr > end) {
			ArrayList<String> baseResult = new ArrayList<>();
			return baseResult;
		}
		ArrayList<String> recResult = null;
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 1; i <= 6; i++) {

			recResult = getBoardPath(curr + i, 10);
			for (int k = 0; k < recResult.size(); k++) {
				myResult.add(i + recResult.get(k));
			}

		}

		return myResult;
	}

	public static void printSS(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSS(ros, res);
		printSS(ros, res + cc);

	}

	public static void printSSascii(String str, String res) {
		if (str == "") {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSSascii(ros, res);
		printSSascii(ros, res + cc);
		printSSascii(ros, res + (int) cc);

	}

	public static void printpermu(String str, String res) {
		if (str == "") {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				printpermu(ros, res + cc);
			}

		}

	}
}
