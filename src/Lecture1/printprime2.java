package Lecture1;

public class printprime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j;
        int n;
        n = 10;

        for (j = 2; j <n; j++) {
            if (isPrime(j))
                System.out.println(j);
        }
    }

    private static boolean isPrime(int m) {


        for (int i = 2; i <m; i++) {
            if (m % i == 0)
                return false;
        }
        return true;
    }

}
