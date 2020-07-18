package stack;

import java.util.*;
import java.io.*;

public class word2_17413 {

	public static void main(String[] args) throws IOException {
		// String s: ������ �ҹ���, ����, ����, Ư�����ڷ� �̷�������
		// < ���ĺ� �ҹ���, ���鸸 ���� >
		// < >�� ���� �ٲ���X
		// ' ' ������ ������ -> pop

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine() + "\n"; // ���ڿ� �Է�
		Stack<Character> stack = new Stack<>();

		boolean tag = true;
		for (char ch : s.toCharArray()) {
			if (ch == ' ' || ch == '\n') {
				while (!stack.empty() && tag == true) {
					bw.write(stack.pop());
				}
				bw.write(ch);
			} else if (ch == '<') { // '>' ���� ������ �迭�� �ְ������
				if (tag == true) {
					while (!stack.empty()) {
						bw.write(stack.pop());
					}
				}
				bw.write(ch);
				tag = false;
			} else if (ch == '>') {
				tag = true;
				bw.write(ch);
			} else {
				if (tag == true) {
					stack.push(ch);
				} else {
					bw.write(ch);
				}
			}
		}
		bw.flush();

	}
}
