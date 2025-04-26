import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            if (N == 0 && M == 0) break;
            
            int[] A = new int[N];
            int[] B = new int[M];
            
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(br.readLine());
            }
            
            int i = 0, j = 0, count = 0;
            while (i < N && j < M) {
                if (A[i] == B[j]) {
                    count++;
                    i++;
                    j++;
                } else if (A[i] < B[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            
            System.out.println(count);
        }
    }
}
