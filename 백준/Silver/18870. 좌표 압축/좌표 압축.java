import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static int[] coordinate(int N, int[] arr) {
		int[][] temp = new int[N][2];

		// 초기 인덱스 저장
		for(int i=0; i<N; i++) {
			temp[i][0] = arr[i];
			temp[i][1] = i;
		}

		// 정렬
		Arrays.sort(temp, (a, b) -> a[0] - b[0]);

		// 순위 배열 생성
		int[] result = new int[N];
		int rank = 0;
		result[0] = 0;

		// 중복값 처리
		for(int i=1; i<N; i++) {
			if(temp[i-1][0] != temp[i][0]) {
				rank++;
			} 
			result[temp[i][1]] = rank;
		}


		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
	
		//int N = 5;
		//int[] arr = {2, 4, -10, 4, -9};

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

        StringBuilder sb = new StringBuilder();
		int result[] = coordinate(N, arr);
		for(int i = 0; i<N; i++) {
			sb.append(result[i]).append(' ');
		}

		System.out.println(sb);

		
	}
}