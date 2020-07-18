package practice;

import java.util.*;

public class NGE_17298 {

	public static void main(String[] args) {
		// ��ū�� ���ϱ�: �����ʿ� �����鼭 a[i]���� ū �� �߿��� ���� ���ʿ� �ִ� ��
		// ���� �̿��ؼ� pop�ϸ鼭 a[i]�� ��, a[i]�� top�̶� �� ������ break -> ��������° ������ �ִ� �� ó��?

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // ���� a�� ũ��
		StringBuilder result = new StringBuilder(); // ������ ���Ƽ� ��
		int[] a = new int[n]; // ���� a
		int[] nge = new int[n];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i <= n - 1; i++) {// ���� a �Է�
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
			// a[i]���� ������ �ٽ� ���ÿ� push
			for (int j = s.size(); j < a.length; j++) {
				s.push(a[j]);
			}
		}
		System.out.println(result);
	}
}
