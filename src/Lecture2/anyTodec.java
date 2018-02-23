package Lecture1;

import java.util.Scanner;

public class anyTodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		int any = s.nextInt();
		System.out.println(decToany(base,any));

	}

	public static int decToany(int base,int any) {
		int i = 0, n = 0, sum = 0, rem = 0;
		while (any != 0) {
			rem = any % 10;
			any = any / 10;

			sum = sum + Power(base, n) * rem;
			System.out.println(n + "n");
			n++;
			i++;

		}
		return (sum);
	}

	public static int Power(int base, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++) {
			if (power == 0) {
				return 1;
			} else {
				result = result * base;

			}
		}
		System.out.println(result + "p");
		return (result);
	}

}
