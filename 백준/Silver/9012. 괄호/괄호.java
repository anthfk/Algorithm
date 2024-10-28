import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			sb.append(func(in.nextLine())).append('\n');
		}
		
		System.out.println(sb.toString());
	}
	
	public static String func(String s) {
		
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				stack.add(c);
			} else {
				if(!stack.isEmpty())
					stack.pop();
				else return "NO";
			}
		}
		
		if(stack.isEmpty()) return "YES";
		else return "NO";	
				
	}
}