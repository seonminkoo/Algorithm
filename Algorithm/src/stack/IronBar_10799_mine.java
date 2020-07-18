package stack;

import java.io.*;
import java.util.Stack;

public class IronBar_10799_mine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 쇠막대기를 자르는 레이저는 적어도 하나 존재, 쇠막대기의 끝과 레이저 겹치지X
		// 잘려진 쇠막대기 조각의 총 개수 구하기
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine(); // 괄호 입력
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
