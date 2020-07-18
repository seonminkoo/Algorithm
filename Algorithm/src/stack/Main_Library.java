package stack;

import java.util.*;

public class Main_Library {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>(); //스택 만들기
		
		for(int i=0; i<n; i++) {
			String cmd = sc.next();
			if(cmd.equals("push")) {
				int x = Integer.parseInt(sc.next());
				stack.push(x);
			}else if(cmd.equals("top")) {
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek()); //peek : 스택의 top
				}
			}else if(cmd.equals("size")) {
				System.out.println(stack.size());
			}else if(cmd.equals("empty")) {
				if(stack.empty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(cmd.equals("pop")) {
				if(stack.empty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.pop());
				}
			}
		}
		
	}
}