import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();

		while(N-- > 0) {
			set.add(br.readLine());
		}

		ArrayList<String> list = new ArrayList<>(set);    
        Collections.sort(list);
		Collections.sort(list, (String a, String b) -> a.length() - b.length());

		for(String s : list) {
			System.out.println(s);
	    }


	}

}