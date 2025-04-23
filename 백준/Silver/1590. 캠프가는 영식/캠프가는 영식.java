import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N, T;
        
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        
        int min = 1000000;
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int I = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            
            for(int j=0; j<C; j++){
                int arrival = S + I * j;
                
                if (arrival >= T) {
                    int wait = arrival - T;
                    min = Math.min(wait, min);
                    break;
                } 
            }
            
        }
        
        if(min == 1000000) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
        
        
        
        
    }
}