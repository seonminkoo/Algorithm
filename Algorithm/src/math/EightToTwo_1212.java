package math;

import java.util.Arrays;
import java.util.Scanner;

public class EightToTwo_1212 {

	public static void main(String[] args) {
		// 배열 안에 0~7까지 2진수 저장해놓고 해당하는 값 나올 때마다 꺼내주기!
		String[] num = { "000", "001", "010", "011", "100", "101", "110", "111" };
		String[] firstNum = { "0", "1", "10", "11", "100", "101", "110", "111" };
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		System.out.print( firstNum[(input.charAt(0)-'0')]); 
		
		for(int i = 1; i<input.length(); i++) {
			System.out.print(num[(input.charAt(i)-'0')]);
		}

	}

}
