package Lecture2;

public class log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(log(32,2));
	}
	public static int log(int num,int base){
		int counter=0;
		while(num!=1){
			num=num/base;
			counter++;
		}
		return counter;
	}

}
