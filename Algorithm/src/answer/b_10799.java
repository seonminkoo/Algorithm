package answer;

import java.util.*;
public class b_10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine().trim(); //공백 제거
		int n = a.length();
		Stack<Integer> s = new Stack<Integer>();
		int ans = 0;
		for(int i=0; i<n; i++) {
			char c =a.charAt(i);
			if(c == '(') {
				s.push(i);
			}else {
				if(s.peek()+1 == i) {
					s.pop();
					ans += s.size();
				}else {
					s.pop();
					ans += 1;
				}
			}
		}
		System.out.println(ans);
	}

}
