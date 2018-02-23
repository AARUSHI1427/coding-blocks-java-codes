package Lecture1;

public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int F;
      int C;
      for(F=0;F<=300;F=F+20){
    	  System.out.print(F+"\t");
    	  C=(int)(((float)5/9)*(F-32));
    	  System.out.print(C);
    	  System.out.println();
      }
	}

}
