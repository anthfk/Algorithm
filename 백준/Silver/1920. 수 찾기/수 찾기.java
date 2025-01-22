import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
      public static boolean findNumber(int[] arr, int i) {
         int min = 0;
         int max = arr.length - 1;
         int mid = 0;
         boolean result = false;

         while(min <= max) {
            mid = (min + max) / 2;
            
            if (i >= arr[mid]){
                min = mid + 1;
                if (i==arr[mid]){
                    result = true;
                };
            } else {
                max = mid - 1;
            }
        }

        return result;
         

      }

      public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(br.readLine());
         int[] arr = new int[N];
         StringTokenizer st = new StringTokenizer(br.readLine());
         for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
         }
         int M = Integer.parseInt(br.readLine());
         int[] num = new int[M];
         st = new StringTokenizer(br.readLine());
         for(int i=0; i<M; i++){
            num[i] = Integer.parseInt(st.nextToken());
         }

         // 배열 정렬
         Arrays.sort(arr);

         for(int i=0; i<M; i++) {
            if(findNumber(arr, num[i])) {
               System.out.println(1);
            } else {
               System.out.println(0);
            }
         }

         // System.out.print(findNumber(N, arr, M, num))
         br.close();
      }
   }
