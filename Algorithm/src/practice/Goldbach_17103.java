package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Goldbach_17103 {

	public static void main(String[] args) {
		// 소수 구해놓고
		// input - i번째 소수하고 input -i보다 작거나 같은 소수 중에서 input - i - k 가 0이 되는 수 있는지 확인!
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int ans = 0; //파티션 수
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
			
			//골드바흐 파티션
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
