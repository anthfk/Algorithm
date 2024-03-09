import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			Stack<Character> stack = new Stack<>();
			String s = br.readLine() + "\n";
			
			for(char c : s.toCharArray()) {
				if(c == ' ' || c == '\n') {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(" ");
				}
				else stack.push(c);
				
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}