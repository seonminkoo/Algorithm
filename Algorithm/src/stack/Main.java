package stack;
import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stack = new int[n];
		int size = 0;
		
		while(n--> 0) {
			String cmd = sc.next();
			if(cmd.equals("push")) {
				int x = Integer.parseInt(sc.next()); //int형으로 바꿔주는 연산
				stack[size++] = x;
			}else if(cmd.equals("pop")) {
				if(size == 0) {
					System.out.println("-1");
				}else {
				System.out.println(stack[size-1]);
				size--;
				}
			}else if(cmd.equals("size")) {
				System.out.println(size);
			}else if(cmd.equals("empty")) {
				if(size == 0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(cmd.equals("top")) {
				if(size == 0) {
					System.out.println("-1");
				}else {
					System.out.println(stack[size-1]);
				}
			}
			
		}
		
		
	}
}