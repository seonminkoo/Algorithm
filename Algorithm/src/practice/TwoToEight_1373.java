package practice;

import java.util.*;


public class TwoToEight_1373 {

	public static void main(String[] args) {
		//charAt(i) - '0' -> 문자를 숫자로 변환
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		int n = s.length();
		
		if(n%3 == 1) {
			System.out.print(s.charAt(0) - '0');
		}else if(n%3 == 2) {
			System.out.print((s.charAt(0)-'0')*2 + (s.charAt(1)-'0')*1 );
		}
		
		for(int i = n%3; i<n; i+=3) {
			System.out.print((s.charAt(i) - '0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0')*1  );
		}
	}
	

}
