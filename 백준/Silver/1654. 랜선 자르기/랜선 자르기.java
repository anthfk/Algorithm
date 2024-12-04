import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static long binary(long N, long[] arr, long max) {
		long mid = 1; // mid가 0이면 오류 발생 
		long min = 1;
		long result = 0;
		
		while(min <= max ) {
			mid = (max + min) / 2;
			
			// 구한 중간값으로 총 몇 개의 랜선이 나오는지 계산
			long cnt = 0;
			for(long i : arr) {
				cnt += i / mid;
				if (cnt >= N) break; // N보다 크면 종료
			}
			
			// 만든 랜선 개수가 N 이상이면 길이 늘림
			if(cnt >= N) {
				result = mid; 	// 현재값 저장
				min = mid + 1;	// 최솟값 증가
				
			} else {
				max = mid - 1; // 최댓값 감소
			}
		}
		
		
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		// String to Int
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		long[] arr = new long[K];
		long max = 0;
		
		for(int i=0; i<K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(max, arr[i]); // max값 구하기
		}
		
		//sb.append(binary(N, arr, max)).append("\n");
		long result = binary(N, arr, max);
		System.out.print(result);
		br.close();
	}
}

