package math;

import java.util.Scanner;

public class LCM_1934 {
	
	public static int gcd(int x, int y) {
		while (y != 0) {
			int r = x % y;
			x = y;
			y = r;
		}
		return x;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int lcm = (a*b)/gcd(a,b);
			System.out.println(lcm);
		}

	}

}
