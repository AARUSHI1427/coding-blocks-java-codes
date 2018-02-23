package DPegs;

public class examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] strg = new int[n + 1];
		// System.out.println(countBoardPathR(0,10, strg));
		// System.out.println(countBoardPathI(10));
		System.out.println(countMaze(15, 15));
		System.out.println(lcsI("abgb", "aggb"));
	}

	public static int countBoardPath(int curr, int end) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += countBoardPath(curr + dice, end);

		}
		return count;
	}

	public static int countBoardPathR(int curr, int end, int[] strg) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += countBoardPathR(curr + dice, end, strg);

		}
		strg[curr] = count;
		System.out.println(strg[curr]);
		return count;
	}

	public static int countBoardPathI(int end) {
		int[] strg = new int[end + 1];
		// seed
		strg[end] = 1;

		for (int i = end - 1; end >= 0; i--) {
			int sum = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				sum = sum + strg[dice + i];
			}
			strg[i] = sum;

		}
		return strg[0];
	}

	public static int countMaze(int er, int ec) {
		int[][] strg = new int[er + 1][ec + 1];
		strg[er][ec] = 1;
		// d approach
		// for (int i = 0; i <= er; i++) {
		// int j = ec;
		// strg[i][j] = 1;
		// }
		// for (int j = 0; j <= ec; j++) {
		// int i = er;
		// strg[i][j] = 1;
		// }
		for (int i = er; i >= 0; i--) {
			for (int j = ec; j >= 0; j--) {
				if (i == er || j == ec) {
					strg[i][j] = 1;
				} else {
					strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
				}

			}

		}
		return strg[0][0];

	}

	public static int lcs(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;// longest common s if no other common
		}
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int rv = 0;
		if (s1.charAt(0) == s2.charAt(0)) {
			rv = 1 + lcs(ros1, ros2);
		} else {
			int f1 = lcs(ros1, s2);
			int f2 = lcs(s1, ros2);
			rv = Math.max(f1, f2);
		}
		return rv;
	}

	public static int lcsI(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		strg[s1.length()][s2.length()] = 0;
		for (int i = s1.length(); i >= 0; i--) {
			for (int j = s2.length(); j >= 0; j--) {
				if (i == s1.length() || j == s2.length()) {
					strg[i][j] = 0;
					continue;
				}
				if (s1.charAt(i) == s2.charAt(j)) {
					strg[i][j] = 1 + strg[i + 1][j] + strg[i][j + 1];
				} else {
					strg[i][j] = Math.max(strg[i + 1][j], strg[i][j + 1]);
				}
			}
		}
		return strg[0][0];

	}
	public static int editDistance(String s1,String s2){
		if(s1.length()==0){
			return s2.length();
		}
		if(s2.length()==0){
			return s1.length();
		}
		
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int rv=0;
		if(s1.charAt(0)==s2.charAt(0)){
			rv=editDistance(ros1, ros2);
		}else{
			int f1=1+editDistance(ros1, ros2);
			int f2=1+editDistance(ros1, s2);
			int f3=1+editDistance(s1, ros2);
			rv=Math.min(f1, Math.min(f2, f3));
		}
		return rv;
	}
	
	public static int editDistanceI(String s1,String s2){
		int[][] strg=new int[s1.length()+1][s2.length()+1];
		//seed
		strg[s1.length()][s2.length()]=0;
		for(int i = s1.length(); i >= 0; i--){
			for(int j = s2.length(); j >= 0; j--){
				if(i==s1)
			}
		}
	}
}
