import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        
        // 첫번째 문자열과 나머지 문자열 비교
        StringBuilder sb = new StringBuilder(S);
        
        for(int i=1; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<sb.length(); j++){
                if(sb.charAt(j) != s.charAt(j)){
                    sb.setCharAt(j, '?'); // 다르면 '?'로 치환
                } 
            }
        }
        
        System.out.print(sb);
        
    }
}