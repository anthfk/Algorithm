import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static long tree(int M, long[] h, long max) {
		long mid;
		long min = 0;
		long result = 0;
		
		while(min <= max) {
			long sum = 0;
			mid = (min + max) / 2;
			
			// 자르고 남은 나무 길이 합산
			for(long i : h) {
				sum += Math.max(0, i-mid); // 나무 높이가 더 낮으면 0
			}
			
			// 필요한 나무 길이 M 이상이면
			if(sum >= M) {
				result = mid;
				min = mid + 1;
			} else {
				max = mid - 1;
			}
			
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken()); // 나무의 수
		int M = Integer.parseInt(st.nextToken()); // 집으로 가려가려는 나무의 수
		
		long[] h = new long[N];
		long max = 0;
		
		// 공백 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			h[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, h[i]); // max는 가장 큰 나무 길이
		}
		
		System.out.print(tree(M, h, max));
		br.close();
		
		
	}
}

