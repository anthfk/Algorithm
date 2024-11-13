import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			String s = in.nextLine();
			String[] words = s.split(" ");
			
			for(String w : words) {
				sb.append(new StringBuilder(w).reverse().toString()).append(" ");
				// stringbuilder 자체를 반환하므로 toString
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
}
