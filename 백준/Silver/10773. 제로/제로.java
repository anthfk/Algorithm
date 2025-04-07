import java.util.*;
import java.io.*;

class Main {
    static Stack<Integer> stack;
    
    public void zero(int n){
        if (n==0) stack.pop();
        else {
            stack.add(n);
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        stack = new Stack<>();
        
        int K = Integer.parseInt(br.readLine());
        while(K-- > 0){
            int n = Integer.parseInt(br.readLine());
            T.zero(n);
        }
        
        int result = 0;
        for(int n : stack){
            result += n;
        }
        
        System.out.println(result);
        
        
        
    }
}