package practice;

import java.util.*;

public class check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 100;
		boolean[] check = new boolean[m + 1];
		check[0] = check[1] = check[2] = true;
		for (int i = 2; i * i <= m; i++) {
			if (check[i] == true) {
				continue;
			}
			for (int j = i + i; j <= m; j += i) {
				check[j] = true;
			}
		}
		for (int i = 0; i <= m; i++) {
			if (check[i] == false) {
				System.out.println(i);
			}
		}

	}

}
