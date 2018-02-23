package Lecture1;

public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=0;
 int b=1;
 int c=0,i,n=6;
 i=1;
 while(i<=n){
	 c=a+b;
	 System.out.println(a);
	
	 a=b;
	 b=c;
	 i++;
 }
 
	}
}
