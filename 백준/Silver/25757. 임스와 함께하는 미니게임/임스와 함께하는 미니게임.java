import java.util.*;
import java.io.*;
class Main {
		public static int countG(int N, char G, BufferedReader br) throws IOException {
			int result = 0;
			HashSet<String> set = new HashSet<>();
			
			while(N-->0) {
				String id = br.readLine();
				set.add(id);
			}
            int c = 1;

			switch (G) {
                case 'Y': c = 2; break;
				case 'F': c = 3; break;
				case 'O': c = 4; break;
				
			};

			result = set.size() / (c-1);

			return result;

		}

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			char G = str.charAt(0);

			System.out.print(countG(N, G, br));

		}
	}