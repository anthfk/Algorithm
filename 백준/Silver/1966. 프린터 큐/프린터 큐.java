import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	static LinkedList<int[]> q; // 중요도 저장 큐
	
	public static int solution(int m) {
		int answer = 0;
		
		while(!q.isEmpty()) {
			int[] first = q.poll(); // 맨 앞의 원소
			boolean isMax = true; // 해당 원소가 가장 큰지 검사하는 변수
			
			// 큐에 남아있는 원소들과 중요도 비교
			for(int i=0; i<q.size(); i++) {
				// 처음 뽑은 원소보다 큐에 있는 i번째 원소의 중요도가 클 경우
				if(first[1] < q.get(i)[1]) {
					// 뽑은 원소 및 i 이전의 원소들을 뒤로 재배치
					q.offer(first);
					for(int j=0; j<i; j++) {
						q.offer(q.poll());
					}
					
					// first원소가 가장 큰 원소가 아니였으므로 false를 하고 탐색 종료
					isMax = false;
					break;
				}
			}
			
			// first 원소가 가장 큰 원소가 아니였으므로 다음 반복문으로 넘어감
			if(isMax == false) {
				continue;
			}
			
			// first 원소가 가장 큰 원소였으므로 해당 원소는 인쇄해야하는 문서
			answer++;
			
			if(first[0] == m) { // 찾는 원소일 경우 종료
				break;
			}
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(k-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			q = new LinkedList<>();
			
			for(int i=0; i<n; i++) {
				// {초기 위치, 중요도}
				q.offer(new int[] {i, in.nextInt()});
			}
			
			sb.append(solution(m)).append("\n");
		}
		
		System.out.println(sb);
	}
}
