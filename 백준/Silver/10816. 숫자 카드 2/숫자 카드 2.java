import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static String card(int N, long[] card, int M, long[] num) {
		HashMap<Long, Integer> map = new HashMap<>();
		
		for(long c : card) {
			// map에 값이 있으면 1을 더해주고 아니라면 1로 초기화
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		StringBuilder sb = new StringBuilder();
		for(long n : num) {
			sb.append(map.getOrDefault(n,0)).append(" ");	// 있으면 value값 없으면 0
		}
		
		return sb.toString().trim(); // trim: 앞뒤공백제거
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine()); // 현재 카드의 수
		long[] card = new long[N];	// 카드 배열
		

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int M = Integer.parseInt(br.readLine()); 
		long[] num = new long[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(card(N, card, M, num));
		br.close();
		
		
	}
}

