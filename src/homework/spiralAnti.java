package homework;

import java.util.Scanner;

public class spiralAnti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			int arr[][];
			int rows = s.nextInt();
			int cols = s.nextInt();
			arr = new int[rows][cols];
	        for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[row].length; col++) {
					arr[row][col] = s.nextInt();
				}

			}
			spiralWave(arr);
			
	    }
	    public static void spiralWave(int[][] arr){
	        int left=0,top=0,right=arr[top].length-1,bottom=arr.length-1;
	        int dir=1;
	        int count=(bottom+1)*(right+1);
	        while (top <= bottom && left <= right) {
	        if(count>0){
	            if(dir==1){
	                for(int i=top;i<=bottom;i++){
	                    System.out.print(arr[i][left]+", ");
	                    count--;
	                }
	                left++;
	                dir=2;
	            }
	        }
	         if(count>0){
	            if(dir==2){
	                for(int i=left;i<=right;i++){
	                    System.out.print(arr[bottom][i]+", ");
	                    count--;
	                }
	                bottom--;
	                dir=3;
	            }
	        } if(count>0){
	            if(dir==3){
	                for(int i=bottom;i>=top;i--){
	                    System.out.print(arr[i][right]+", ");
	                    count--;
	                }
	                right--;
	                dir=4;
	            }
	        } if(count>0){
	            if(dir==4){
	                for(int i=right;i>=left;i--){
	                    System.out.print(arr[top][i]+", ");
	                    count--;
	                }
	                top++;
	                dir=1;
	            }
	        }
	        }
	        System.out.println("END");
	}

}
