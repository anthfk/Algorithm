import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> xmap= new HashMap<>();
        HashMap<Integer, Integer> ymap = new HashMap<>();
        
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        while(n-- > 0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xmap.put(x, xmap.getOrDefault(x, 0) + 1);
            ymap.put(y, ymap.getOrDefault(y, 0) + 1);
            
        }
        
        for(int x : xmap.values()) {
            if(x > 1) count++;
        }
        
        for(int y : ymap.values()){
            if(y > 1) count++;
        }
        
        System.out.print(count);
    }
}