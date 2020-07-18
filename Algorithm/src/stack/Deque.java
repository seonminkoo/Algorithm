package stack;

import java.util.*;

public class Deque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayDeque<Integer> d = new ArrayDeque<>();

		while (n-- > 0) {

			String cmd = sc.next();
			if (cmd.equals("push_back")) {
				int x = Integer.parseInt(sc.next());
				d.offerLast(x);
			} else if (cmd.equals("push_front")) {
				int x = Integer.parseInt(sc.next());
				d.offerFirst(x);
			} else if (cmd.equals("front")) {
				if (d.isEmpty()) {
					System.out.println("-1");
				}else {
				System.out.println(d.peekFirst());
				}
			} else if (cmd.equals("back")) {
				if (d.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(d.peekLast());
				}
			} else if (cmd.equals("size")) {
				System.out.println(d.size());
			} else if (cmd.equals("empty")) {
				if (d.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (cmd.equals("pop_front")) {
				if (d.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(d.pollFirst());
				}
			} else if (cmd.equals("pop_back")) {
				if (d.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(d.pollLast());
				}
			}
		}
	}

}
