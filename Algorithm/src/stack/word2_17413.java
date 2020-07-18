package stack;

import java.util.*;
import java.io.*;

public class word2_17413 {

	public static void main(String[] args) throws IOException {
		// String s: 알파펫 소문자, 숫자, 공백, 특수문자로 이뤄져있음
		// < 알파벳 소문자, 공백만 존재 >
		// < >는 순서 바꾸지X
		// ' ' 나오면 뒤집기 -> pop

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine() + "\n"; // 문자열 입력
		Stack<Character> stack = new Stack<>();

		boolean tag = true;
		for (char ch : s.toCharArray()) {
			if (ch == ' ' || ch == '\n') {
				while (!stack.empty() && tag == true) {
					bw.write(stack.pop());
				}
				bw.write(ch);
			} else if (ch == '<') { // '>' 나올 때까지 배열에 넣고싶은데
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
