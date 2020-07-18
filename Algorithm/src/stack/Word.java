package stack;

import java.util.*;
import java.io.*;

public class Word {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 첫 줄에 테스트 케이스
		// 단어 사이에 공백으로 구분 -> 공백 나올 때 마다 pop

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (t-- > 0) {
			String str = bf.readLine() + "\n";
			Stack<Character> stack = new Stack<>();
			for (char ch : str.toCharArray()) { // for(변수 : 배열) 배열에 들어 있는 값을 하나씩 변수에 대입
				if (ch == '\n' || ch == ' ') {
					while (!stack.empty()) {
						bw.write(stack.pop());
					}
					bw.write(ch); //띄어쓰기 출력
				} else {
					stack.push(ch);
				}
			}
		}
		bw.flush();
	}

}
