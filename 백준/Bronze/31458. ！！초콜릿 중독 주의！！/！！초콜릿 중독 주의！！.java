import java.util.*;
import java.io.*;


class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());    // 수식의 개수
        String s;
        
        
        for(int i=0; i<T; i++) {
            s = br.readLine();
            int left=0; // 숫자 앞 !
            int right=0; //숫자 뒤 !
            int n = 0;
            boolean find = false; // 숫자 찾았는지 확인
            
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                
                if(c == '!') {
                    if(!find) left++;   // 찾기 전
                    else right++;       // 찾은 후
                } else {
                    find = true;
                    n = c - '0';
                }
            }
            
            // 1. 팩토리얼 
            for(int k=0; k<right; k++){  
                n = 1;
            }
            
            // 2. 논리반전
            for(int k=0; k<left; k++){
                n = (n == 1) ? 0 : 1;
            }
            
            System.out.println(n);
            
        }
        
        
    }
    
}