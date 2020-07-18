package stack;

import java.util.*;

public class editor_1406_mine {
	// stack 2개 사용해서 커서 기준으로 L은 pop(s1) push(s2) s1.peek를 s2에 push하고 s1 pop
	// D는 pop(s2) push(s1) 맨 뒤에 있으면 무시 s2.size == 0이면
	// B는 pop(s1), 맨 앞에 있으면 무시: s1.size == 0이면 무시
	// P $은 s1.push($)
	// 마지막에 s2 s1 순서로 pop하고 뒤집어서 출력!

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 초기 문자열
		int cmdNum = sc.nextInt(); // 입력할 명령어 개수

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
