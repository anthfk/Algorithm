import java.util.*;
import java.io.*;

class Main {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        while(true){
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            if(N==0 && M==0) break;
            
            HashSet<Integer> Ncd = new HashSet<>();
            
            for(int i=0; i<N; i++){
                int n = Integer.parseInt(br.readLine());
                Ncd.add(n);
            }
            
            for(int i=0; i<M; i++){
                int m = Integer.parseInt(br.readLine());
                if(Ncd.contains(m)){
                    count++;
                }
            }
            
            System.out.println(count);
            
            
        }
        

        
        
    }
}

