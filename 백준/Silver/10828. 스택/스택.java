import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x;
			
			switch(st.nextToken()) {
				case "push":
					stack.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					if(stack.empty()) sb.append(-1).append('\n');
					else sb.append(stack.pop()).append('\n');
					break;
				case "size":
					sb.append(stack.size()).append('\n');
					break;
				case "empty":
					x = stack.empty() ? 1 : 0;
					sb.append(x).append('\n');
					break;
				case "top":
					if(stack.empty())
						sb.append(-1).append('\n');
					else
						sb.append(stack.peek()).append('\n');
					break;
			}
		}
		System.out.println(sb);
		
	}
}