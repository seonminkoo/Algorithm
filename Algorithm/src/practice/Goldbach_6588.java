package practice;

import java.util.Scanner;

public class Goldbach_6588 {
	public static final int MAX = 1000000;
	public static void main(String[] args) {
		// 1. �����佺�׳׽� ü �̿��ؼ� �Ҽ� ���ϱ�
		// 2. ���� ���� �Ҽ�����(3����) n-a�� ������ �Ҽ��� �߿� ������ �� ���� b��!
		// n-a < n/2 �Ǹ� wrong ���
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