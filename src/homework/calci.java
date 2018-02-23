package homework;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float res = 0;
		char c1 = 'X';
		char c2 = 'x';
		float N1, N2;
		char c = s.next().charAt(0);
		if (c == c1 || c == c2) {
			return;
		} else {
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				if (c == '+') {
					N1 = s.nextInt();
					N2 = s.nextInt();
					res = N1 + N2;
					System.out.println(res);

				}
				if (c == '-') {
					N1 = s.nextInt();
					N2 = s.nextInt();

					res = N1 - N2;
					System.out.println(res);

				}
				if (c == '*') {
					N1 = s.nextInt();
					N2 = s.nextInt();
					res = N1 * N2;
					System.out.println(res);

				}
				if (c == '/') {
					N1 = s.nextInt();
					N2 = s.nextInt();
					if (N2 != 0) {
						res = N1 / N2;
						System.out.println(res);

					}
				}

			} else {

				System.out.println("Invalid operation. Try again.");
			}

		}

	}

}
