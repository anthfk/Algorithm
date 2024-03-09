import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
	public static String solution(String s) {
		String answer = "NO";
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == ')') {
				if(stack.isEmpty()) return answer;
				stack.pop();
			} else if(c == '(') {
				stack.push(c);
			}
		}
		
		if(stack.isEmpty()) {
			answer = "YES";
		}
		
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			sb.append(solution(br.readLine())).append('\n');
		}
		
		System.out.println(sb);
		
	}
}
