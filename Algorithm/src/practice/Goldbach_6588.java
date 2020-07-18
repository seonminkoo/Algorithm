package practice;

import java.util.Scanner;

public class Goldbach_6588 {
	public static final int MAX = 1000000;
	public static void main(String[] args) {
		// 1. 에라토스테네스 체 이용해서 소수 구하기
		// 2. 가장 작은 소수부터(3부터) n-a가 나머지 소수들 중에 있으면 그 수를 b로!
		// n-a < n/2 되면 wrong 출력
		Scanner s = new Scanner(System.in);
		boolean[] check = new boolean[MAX + 1];

		for (int i = 2; i * i <= MAX; i++) {
			if (check[i] == true) {
				continue;
			}
			for (int j = i + i; j <= MAX; j += i) {
				check[j] = true;
			}
		}

		// for(int i = 0; i<= MAX; i++) {
		// if(check[i] == false) {
		// System.out.println(i);
		// }
		// }

		while (true) {
			int prime = s.nextInt();
			boolean flag = false;
			if (prime == 0) {
				break;
			}

			for (int k = 3; k <= prime / 2; k++) {
				//int a = 0;
				if ((check[k] == false) && (check[prime - k] == false) && ((prime - k) != 2)) {
//					a = k;
//					int b = prime - a;
					System.out.println(prime + " = " + k + " + " + (prime - k));
					flag = true;
					break;
				} else {
					continue;
				}
			}
			if (flag == false) {
				System.out.println("Goldbach's conjecture is wrong.");
			}

		}
	}
}