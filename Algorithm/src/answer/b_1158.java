package answer;

import java.util.*;
public class b_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i<=n; i++) {
			q.offer(i);
		}
		for(int i = 0; i <n-1; i++) {
			for(int j =0; j<m-1; j++) {
				q.offer(q.poll());
			}
			sb.append(q.poll() + ", ");
		}
		sb.append(q.poll() + ">");
		System.out.println(sb);
	}
}
