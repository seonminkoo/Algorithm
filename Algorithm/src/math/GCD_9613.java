package math;

import java.util.Scanner;

public class GCD_9613 {
	public static int gcd(int x, int y) {
		while (y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while (t-- > 0) {
			long ans = 0;
			int n = s.nextInt();
			int[] num = new int[n];

			for (int i = 0; i < n; i++) {
				num[i] = s.nextInt();
			}

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					ans += gcd(num[i], num[j]);
				}
			}
			System.out.println(ans);
		}

	}

}
