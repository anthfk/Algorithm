import java.util.*;
import java.io.*;

class Main{
    public static int binary(int[] A, int D){
        int result = -1;
        int left = 0, right = A.length-1;
        
        while(left <= right){
            int mid = (left+right)/2;
            
            if(A[mid] == D){
                result = mid;
                right = mid - 1;
            } else if(A[mid] < D) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        
        
        return result;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] A = new int[N];
        
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        
        // A정렬
        Arrays.sort(A);
        
        for(int i=0; i<M; i++){
            System.out.println(binary(A, Integer.parseInt(br.readLine())));
        }
        
    }
    
    
    
}