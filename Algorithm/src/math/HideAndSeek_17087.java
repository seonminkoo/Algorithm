package math;

import java.util.Scanner;

public class HideAndSeek_17087 {
	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			a[i] = Math.abs(s - a[i]);
		}
		int ans = a[0];
		for (int i = 0; i < n; i++) {
			ans = gcd(ans, a[i]);
		}
		System.out.println(ans);
	}
}