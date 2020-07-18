package stack;

import java.util.*;

public class editor_1406_mine {
	// stack 2�� ����ؼ� Ŀ�� �������� L�� pop(s1) push(s2) s1.peek�� s2�� push�ϰ� s1 pop
	// D�� pop(s2) push(s1) �� �ڿ� ������ ���� s2.size == 0�̸�
	// B�� pop(s1), �� �տ� ������ ����: s1.size == 0�̸� ����
	// P $�� s1.push($)
	// �������� s2 s1 ������ pop�ϰ� ����� ���!

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // �ʱ� ���ڿ�
		int cmdNum = sc.nextInt(); // �Է��� ��ɾ� ����

		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			s1.push(str.charAt(i));
		}

		while (cmdNum-- > 0) {
			char cmd = sc.next().charAt(0);
			if (cmd == 'L') {
				if (s1.size() != 0) {
					s2.push(s1.peek());
					s1.pop();
				}
			} else if (cmd == 'D') {
				if (s2.size() != 0) {
					s1.push(s2.peek());
					s2.pop();
				}
			} else if (cmd == 'B') {
				if (s1.size() != 0) {
					s1.pop();
				}
			} else if (cmd == 'P') {
				char x = sc.next().charAt(0);
				s1.push(x);
			}
		}

		StringBuilder result = new StringBuilder();

		while (s1.size() != 0) {
			result.append(s1.pop());
		}
		result.reverse();
		while (s2.size() != 0) {
			result.append(s2.pop());
		}
		System.out.println(result);
	}

}
