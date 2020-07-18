package stack;

import java.util.*;

public class Josephus_1158_mine {
	// 처음과 끝이 연결되어 있음 or 처음과 끝 모두 접근 가능
	// index 표현 가능해야함

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] p = new int[5000];

		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		sb.append("<");
		
		for (int i = 1; i <= n; i++) {	
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			for(int i = 0; i<k-1; i++) {
				q.offer(q.remove());
			}
			sb.append(q.peek());
			if(q.size() != 1) {
				sb.append(", ");
			}
			q.remove();
		}
		
		sb.append(">");
		
		System.out.println(sb);

	}

}
