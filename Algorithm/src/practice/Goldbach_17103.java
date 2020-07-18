package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Goldbach_17103 {

	public static void main(String[] args) {
		// �Ҽ� ���س���
		// input - i��° �Ҽ��ϰ� input -i���� �۰ų� ���� �Ҽ� �߿��� input - i - k �� 0�� �Ǵ� �� �ִ��� Ȯ��!
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int ans = 0; //��Ƽ�� ��
			int n = sc.nextInt();
			int[] prime = new int[n];
			int pn = 0;
			boolean[] check = new boolean[n + 1];

			for (int i = 2; i <= n; i++) {
				if (check[i] == false) {
					prime[pn++] = i;
					for (int j = i * i; j <= n; j += i) {
						check[j] = true;
					}
				}
			}
			
			//������ ��Ƽ��
			for(int i = 0; i< n/2; i++) {
				int temp = n - prime[i];
				for(int j = i; j <n; j++) {
					if(temp - prime[j] == 0) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
		
	}

}
