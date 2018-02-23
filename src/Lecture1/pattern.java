package Lecture1;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int value=1;
		int row = 1;
		int col = 1;
		while(row<=n){
			col=1;
			while(col<=row){
				System.out.print(value+"\t");
				value++;
				col++;
			}
			
			System.out.println();
			row++;
		}

	}

}
