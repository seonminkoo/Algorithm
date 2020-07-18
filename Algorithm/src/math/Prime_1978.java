package math;

import java.util.Scanner;

public class Prime_1978 {
	public static boolean prime(int x) {
		if(x < 2) {
			return false;
		}
		for(int i = 2; i<x-1; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		
		while(n--> 0) {
			if(prime(sc.nextInt())) {
				result++;
			}
		}
		System.out.println(result);
	}

}
