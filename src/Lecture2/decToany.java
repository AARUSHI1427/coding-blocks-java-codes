package Lecture1;

import java.util.Scanner;

public class decToany {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		int dec = s.nextInt();
		System.out.println(decToany(base,dec));

	}

	public static int decToany(int base,int dec) {
		int i = 0, n = 0, sum = 0, rem = 0;
		while (dec != 0) {
			rem = dec % base;
			dec = dec / base;

			sum = sum + Power(10, n) * rem;
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
