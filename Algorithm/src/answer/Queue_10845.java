package answer;

import java.util.*;

public class Queue_10845 {
	
	//ť���� back �޼ҵ� ��� ���� �����ؼ� �ذ��ؾ� ��

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();

		while (n-- > 0) {
			String cmd = sc.next();

			if (cmd.equals("push")) {
				int x = Integer.parseInt(sc.next());
				q.offer(x); // add�� �޸� �� ���� push ����
			} else if (cmd.equals("pop")) {
				if(q.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(q.poll());
				}
			}else if(cmd.equals("size")) {
				System.out.println(q.size());
			}
			else if (cmd.equals("empty")) {
				if(q.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			} else if (cmd.equals("front")) {
				if (q.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(q.peek());
				}
			} else if (cmd.equals("back")) {
				if(q.isEmpty()) {
					System.out.println("-1");
				}else {
					//ť�� back �޼ҵ� X!
				}
			}
		}

	}

}
