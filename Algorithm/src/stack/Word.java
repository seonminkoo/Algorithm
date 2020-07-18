package stack;

import java.util.*;
import java.io.*;

public class Word {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// ù �ٿ� �׽�Ʈ ���̽�
		// �ܾ� ���̿� �������� ���� -> ���� ���� �� ���� pop

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (t-- > 0) {
			String str = bf.readLine() + "\n";
			Stack<Character> stack = new Stack<>();
			for (char ch : str.toCharArray()) { // for(���� : �迭) �迭�� ��� �ִ� ���� �ϳ��� ������ ����
				if (ch == '\n' || ch == ' ') {
					while (!stack.empty()) {
						bw.write(stack.pop());
					}
					bw.write(ch); //���� ���
				} else {
					stack.push(ch);
				}
			}
		}
		bw.flush();
	}

}
