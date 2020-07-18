package stack;

import java.io.*;
import java.util.Stack;

public class IronBar_10799_mine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// �踷��⸦ �ڸ��� �������� ��� �ϳ� ����, �踷����� ���� ������ ��ġ��X
		// �߷��� �踷��� ������ �� ���� ���ϱ�
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine(); // ��ȣ �Է�
		int output = 0;
		boolean tag = true;
		Stack<Character> s = new Stack<>();
		for (char ch : input.toCharArray()) {
			if (ch == ')') {
				if (tag == true) {
					s.pop();
					output += s.size();
					tag = false;
				} else if (tag == false) {
					s.pop();
					output++;
				}
			} else {
				tag = true;
				s.push(ch);
			}
		}
		System.out.println(output);
	}

}
