package stack;

import java.util.*;

public class stack_1874 {
	// ���� 1���� ���� ���� �迭 1�� �ʿ�
	// ���ÿ� ���� �� ���� ���� ��� �� ������ ū �� �ֱ�
	// push pop ���� �Լ�

	public static void calc(int[] i) { // �迭 �޾Ƽ� �ϳ��� ���� ������ �Ǵ��ؾ���
		Stack<Integer> s = new Stack<>();
		int m = 0; // ���ÿ� �߰� �� ��
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
		int n = sc.nextInt(); // ���갳�� n

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); // ������ �̷�� ���� �Է�
		}

		calc(a);

	}

}
