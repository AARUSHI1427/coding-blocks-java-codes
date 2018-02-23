package Lecture1;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		if(N>0&&N<100){
		int i=1;
		 int a=0;
		 int b=1;
		 int c=0;
		int row = 1;
		int col = 1;
		while(i<=N){
		
		while(row<=N){
			
			col=1;
			while(col<=row){
				System.out.print(a+"\t");
				c=a+b;
				 a=b;
				 b=c;
				
				col++;
			}
			System.out.println();
			row++;
		  }
		 i++;
		}
		}
	}

}
