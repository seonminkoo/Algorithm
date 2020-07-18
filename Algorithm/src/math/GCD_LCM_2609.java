package math;

import java.util.Scanner;

public class GCD_LCM_2609 {
	public static int gcd(int a, int b) { // gcd(a,b) = gcd(b,a%b)
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();

		System.out.println(gcd(input1, input2));
		System.out.println(lcm(input1, input2));

	}

}
