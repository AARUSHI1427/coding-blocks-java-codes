package Lecture1;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int value=1;
		int row = 1;
		int col = 1;
		while(row<=n){
			col=1;
			while(col<=row){
				if(col==1||col==row){
					System.out.print(row+"\t");
				}else{
					System.out.print("0\t");
					
				}

				col++;
			}
			System.out.println();
			row++;
		}
	}

}
