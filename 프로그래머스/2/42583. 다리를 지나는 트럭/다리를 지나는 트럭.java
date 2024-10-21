import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    int time = 0;
    int sum = 0;
    Queue<Integer> q = new LinkedList<>();

    for(int t : truck_weights) {
		while(true) {
			if(q.isEmpty()) { // 비었을때
				q.offer(t);
				sum += t;
				time++;
                break;
			}
			else if(q.size() == bridge_length) { // 꽉찼을때
				sum -= q.poll();
				//time++;
			}
			else { // 공간있을때
				if(sum+t<=weight) { // 다음꺼 가능 
					q.offer(t);
					time++;
					sum += t;
					break;
				}
				else {	// 다음꺼 불가능
					q.offer(0);
					//sum -= q.poll();
                    time++;
					//break;
				}
			}
		}
    }    
	
        
       return time+bridge_length;
    }
}