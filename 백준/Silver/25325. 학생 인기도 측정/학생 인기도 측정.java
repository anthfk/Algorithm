import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            String name = st.nextToken();
            map.put(name, 0);
        }
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String name = st.nextToken();
                map.put(name, map.get(name)+1);
            }
        }
        
        // 정렬
        List<Map.Entry<String, Integer>> entry = new ArrayList<>(map.entrySet());
        
        Collections.sort(entry, (a, b) -> {
            if(b.getValue().equals(a.getValue())) { 
                return a.getKey().compareTo(b.getKey()); // key오름차순
            }
            
            return b.getValue() - a.getValue(); // value 내림차순
        
        });
        
        //출력
        for(Map.Entry<String, Integer> e : entry){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        
        
    }
}