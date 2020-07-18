package practice;

import java.util.*;

public class NGE_17298 {

	public static void main(String[] args) {
		// 오큰수 구하기: 오른쪽에 있으면서 a[i]보다 큰 수 중에서 가장 왼쪽에 있는 수
		// 스택 이용해서 pop하면서 a[i]랑 비교, a[i]랑 top이랑 수 같으면 break -> 마지막번째 수열에 있는 수 처리?

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 수열 a의 크기
		StringBuilder result = new StringBuilder(); // 붙임이 많아서 씀
		int[] a = new int[n]; // 수열 a
		int[] nge = new int[n];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i <= n - 1; i++) {// 수열 a 입력
			a[i] = sc.nextInt();
			s.push(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			nge[i] = -1;
			while (a[i] != s.peek()) {
				if (a[i] < s.peek()) {
					nge[i] = s.peek();
				}
				s.pop();
			}
			result.append(nge[i] + " ");
			// a[i]부터 끝까지 다시 스택에 push
			for (int j = s.size(); j < a.length; j++) {
				s.push(a[j]);
			}
		}
		System.out.println(result);
	}
}
