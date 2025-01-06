import java.util.Arrays;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long min = 1;
        long mid;
        long count;
        long max = Arrays.stream(times).max().getAsInt();
        max = max * n;
        
        
        while(min <= max) {
            mid = (min + max) / 2;
            count = 0;  // count 초기화
            for(int i : times){
                count += mid / i;
            }
            
            if(count >= n) {
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        
        
        return answer;
    }
}