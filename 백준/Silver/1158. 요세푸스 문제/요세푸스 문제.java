import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
	public static StringBuilder solution(int n, int k) {
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			if(q.size()==1) {
				sb.append(q.poll()).append(">");
			}
			else {
				for(int i=0; i<k-1; i++) q.offer(q.poll());
				sb.append(q.poll()).append(", ");
			}
		}
		
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		System.out.println(solution(n,k));
	}
}
