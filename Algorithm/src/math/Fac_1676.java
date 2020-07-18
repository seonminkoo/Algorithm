package math;

import java.util.Scanner;

public class Fac_1676 {

	public static void main(String[] args) {
		// 5의 개수 세면 됨, 5 중복으로 나오는 경우도 셈

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		for (int i = 5; i <=n; i*=5) {
			ans+= n/i;
		}
		System.out.println(ans);

	}

}
