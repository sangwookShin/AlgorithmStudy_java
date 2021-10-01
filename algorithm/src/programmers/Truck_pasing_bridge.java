package programmers;
import java.util.*;
public class Truck_pasing_bridge {

	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int all_weight = 0; //다리에 있는 모든 트럭 무게
        int j = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        while(j != truck_weights.length) {

            if(q.isEmpty()) { //큐가 비었으면
                q.add(truck_weights[j]);
                all_weight += truck_weights[j];
                answer++;
                j++;
            }
            else if(q.size() == bridge_length) { //올라갈 수 있는 트럭수 검사
               all_weight -= q.poll();
            }
            else { //큐가 비었고, 트럭이 올라갈 수 있음
                if(all_weight + truck_weights[j] <= weight) {   //무게 가능
                    q.add(truck_weights[j]);
                    all_weight += truck_weights[j];
                    answer++;
                    j++;
                }
                else {  //무게 불가능
                    q.add(0);
                    answer++;
                }//else
            }//else 
        } //while
        
        return answer + bridge_length;
    }
}
