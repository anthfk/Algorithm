import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int arr[];
        while((line = br.readLine()) != null) {
            arr = new int[4];
            for(char c : line.toCharArray()){
                if(Character.isLowerCase(c)) arr[0]++;
                else if (Character.isUpperCase(c)) arr[1]++;
                else if (Character.isDigit(c)) arr[2]++;
                else if (c == ' ') arr[3]++;
            }
            
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            
        }
    }
}