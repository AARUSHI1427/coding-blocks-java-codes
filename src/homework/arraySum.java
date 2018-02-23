package homework;

import java.util.Scanner;

public class arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] arr1 = new int[N];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = s.nextInt();
		}

		int M = s.nextInt();
		int[] arr2 = new int[N];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = s.nextInt();
		}
		int[] ans;
		if (N > M) {
			ans = sumArr(arr1, arr2);
		} else {
			ans = sumArr(arr2, arr1);
		}
		for (int i = 0; i < ans.length; i++) {
			if (i == 0 && ans[i] == 0) {
				continue;
			}
			System.out.println(ans[i]);
		}
	}

	public static int[] sumArr(int[] big, int[] small) {
		int[] ans = new int[big.length + 1];
		ans[0] = 0;
		int diff = big.length - small.length;
		int[] newsmall = new int[big.length];
		for (int k = 0; k < diff; k++) {
			newsmall[k] = 0;
		}
		for (int j = newsmall.length; j > diff - 1; j--) {
			newsmall[j] = small[j - diff];
		}
		int carry = 0;
		for (int i = ans.length - 1; i >= 0; i--) {
			int sum = big[i] + newsmall[i] + carry;
			int rem = sum % 10;
			int div = sum / 10;
			if (div == 1) {
				carry = 1;
			} else {
				carry = 0;
			}
			ans[i] = rem;
		}
		return ans;
	}

}
