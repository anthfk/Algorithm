import java.util.*;
import java.io.*;

class Main {
    static int result = 0;
    
    public void word(String s){
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            if(!stack.isEmpty()){
                if(stack.peek() == c) stack.pop();
                else stack.push(c);
            } else {
                stack.push(c);
            }
        }
        
        if(stack.isEmpty()) result++;
        
    }
    
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0){
            String s = br.readLine();
            T.word(s);
        }
        
        System.out.println(result);
    }
}