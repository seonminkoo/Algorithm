package stack;

import java.util.*;

public class stack_1874 {
	// 스택 1개랑 수열 만들 배열 1개 필요
	// 스택에 넣을 수 변수 만들어서 계속 그 수보다 큰 수 넣기
	// push pop 연산 함수

	public static void calc(int[] i) { // 배열 받아서 하나씩 무슨 수인지 판단해야함
		Stack<Integer> s = new Stack<>();
		int m = 0; // 스택에 추가 될 수
		StringBuilder sb = new StringBuilder();

		for (int x : i) {
			if (m < x) {
				while (m != x) {
					s.push(++m);
					sb.append("+\n");
				}
				if(s.peek() == x) {
					s.pop();
					sb.append("-\n");
				}
			}
			else {
				if(s.peek() != x) {
					System.out.println("NO");
					return;
				}
				s.pop();
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 연산개수 n

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); // 수열을 이루는 정수 입력
		}

		calc(a);

	}

}
