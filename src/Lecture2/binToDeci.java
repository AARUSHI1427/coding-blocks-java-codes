package Lecture1;

public class binToDeci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin = 100001;
		System.out.println(binTodeci(bin));

	}

	public static int binTodeci(int bin) {
		int i = 0, n = 0, sum = 0, rem = 0;
		while (bin != 0) {
			rem = bin % 10;
			bin = bin / 10;

			sum = sum + Power(2, n) * rem;
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
