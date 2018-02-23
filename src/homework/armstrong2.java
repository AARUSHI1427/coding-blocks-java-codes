package homework;

import java.util.Scanner;

public class armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N1 = s.nextInt();
		int N2 = s.nextInt();
		int i;
		for (i = N1; i <= N2; i++) {
			arm(i);
			if (arm(i)==true) {
				System.out.println(i);
			}
		}

	}

	public static boolean arm(int N) {
		int c = 0, a, temp;

		temp = N;

		while (N > 0) {
			a = N % 10;
			N = N / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			return (true);
		else
			return (false);

	}
}
