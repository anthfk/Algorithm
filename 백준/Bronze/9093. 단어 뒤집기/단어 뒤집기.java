import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		StringBuffer sb = new StringBuffer();
		Stack<Character> stack = new Stack<>();
		
		while(T-- > 0) {
			String s = in.nextLine();
			String[] word = s.split(" ");
			
			for(String w : word) {
				for(char c : w.toCharArray()) {
					stack.push(c);
				}
				
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
}
