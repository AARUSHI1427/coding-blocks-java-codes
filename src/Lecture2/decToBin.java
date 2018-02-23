package Lecture1;

public class decToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dec = 32;
		System.out.println(decTobin(dec));

	}

	public static int decTobin(int dec) {
		int i = 0, n = 0, sum = 0, rem = 0;
		while (dec != 0) {
			rem = dec % 2;
			dec = dec / 2;

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
