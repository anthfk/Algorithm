import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;

	public class Main {
		public static void main(String args[]) {
			Scanner in = new Scanner(System.in);
			int TC = in.nextInt();	// 테스트케이스 개수
		
			while(TC-- > 0) {
				int N = in.nextInt();	// 문서의 개수
				int M = in.nextInt();	// 큐 위치
				Queue<int[]> q = new LinkedList<>();	// 배열 큐 생성
			
				for(int j=0; j<N; j++) {
					q.add(new int[] {j, in.nextInt()});
				}
			
				System.out.println(func(q, M));
			}
		
		}
	
		public static int func(Queue<int[]> q, int M) {
			int result = 0;
			while(!q.isEmpty()) {
				int[] arr = q.poll();	// poll return값 배열
				boolean chk = true;		// 중요도 높은 것 있으면 true
			
				for(int[] arrQ : q) {	// q 안의 값 모두 비교 후 높은 게 없으면 false
					if(arrQ[1] > arr[1]) {
						chk = false;
						break;
					}
				}
			
				if(chk) {
					result++;
					if(arr[0]==M) break;
		
				} else {
					q.add(arr);	// 횟수증가
				}
			
			
			}
		
			return result;
		}
	
	
	}