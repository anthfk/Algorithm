import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static String card(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr1) {
            map.put(i, 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int j : arr2){
            sb.append(map.getOrDefault(j, 0)).append(" ");
        }
        
        return sb.toString().trim();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] arr1 = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        
        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.print(card(arr1, arr2));
        br.close();
        
    }
}