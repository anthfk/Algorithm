import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int wTotal = 0;
        Queue<Integer> q = new LinkedList<>();
        
        for(int t : truck_weights){
            while(true){
                if(q.isEmpty()){
                    q.offer(t);
                    wTotal += t;
                    time++;
                    break;
                }
                else if(q.size() == bridge_length){ // 다리 가득 찬 경우
                    wTotal -= q.poll();
                }
                else { // 다리가 가득 차지않은 경우
                    if(wTotal+t<=weight){
                        q.offer(t);
                        wTotal += t;
                        time++;
                        break;
                    } else {
                        q.offer(0);
                        time++;
                    }
                }
                
            }
        }        
        return time+bridge_length;
    }
}