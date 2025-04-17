import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        HashMap<String, Integer> map = new HashMap<>();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        // 점수
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            
            String sub = st.nextToken();
            int sco = Integer.parseInt(st.nextToken());
            
            map.put(sub, sco);
        }
        
        // 공개된 과목
        Set<String> knownSubjects = new HashSet<>();
        for (int i = 0; i < K; i++) {
            String subject = br.readLine();
            knownSubjects.add(subject);
        }
        
        int knownSum = 0;

        
        List<Integer> unknownScores = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(knownSubjects.contains(entry.getKey())){
                knownSum += entry.getValue();
            } else {
                unknownScores.add(entry.getValue());
            }
        }
        
        // 비공개 과목 점수 정렬
        Collections.sort(unknownScores);
        
        int max = knownSum;
        int min = knownSum;
        
        for(int i=0; i<M-K; i++){
            min += unknownScores.get(i);
        }
        
        for(int i=0; i<M-K; i++){
            int len = unknownScores.size();
            max += unknownScores.get(len-i-1);
        }
        
       
        
        
        System.out.println(min + " " + max);
        
        
        
        
    }
}