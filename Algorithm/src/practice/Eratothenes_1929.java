package practice;

import java.util.Scanner;

public class Eratothenes_1929 {

	public static void main(String[] args) {
		// 범위로 출력하면 에라토스테네스 체 이용!
		// 0 ~ n까지 수 2의 배수부터 n의 배수까지 지우기
		// 1,2는 예외처리!
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		boolean[] check = new boolean[n+1];
		check[0] = check[1] = true;
		for(int i = 2; i*i <=n; i++) {
			if(check[i] == true) {
				continue;
			}
			for(int j = i*i; j<=n; j+=i) {
				check[j] = true;
			}
		}
		for(int i = m; i<=n; i++) {
			if(check[i] == false) {
				System.out.println(i);
			}
		}
		
	}

}
