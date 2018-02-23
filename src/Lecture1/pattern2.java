package Lecture1;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int value=1;
		int row=1;
		int col=1;
		while(row<=n){
			col=1;
			while(col<=n-row){
				System.out.print("\t");
				value++;
				col++;
				
			}
			col=1;
			value=row;
			while(col<=row){
				System.out.print(value+"\t");
				value++;
				col++;
			}
			col=1;
			value=value-2;
			while(col<row){
				System.out.print(value+"\t");
				value--;
				col++;
			}
			System.out.println();
			row++;
		}
		

	}

}
