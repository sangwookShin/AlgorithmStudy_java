package programmers;

import java.util.Queue;
import java.util.LinkedList;

public class Printer {
class Task {
        
        int location;
        int priority;
        public Task(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int cnt =0;
        
        Queue<Task> queue = new LinkedList<>();
        
        for(int i=0;i<priorities.length;i++) {
            queue.add(new Task(i, priorities[i]));
        }
        
        while(!queue.isEmpty()) {
            
            Task cur = queue.poll();
            boolean flag = false;
            
            for(Task t : queue) {
                if(cur.priority<t.priority) {
                    flag = true;        
                }       
            }
            
            if(flag == true) {
                queue.add(cur);
            }
            else {
                cnt++;
                if(cur.location == location) {
                    answer = cnt;
                    break;
                }
            }
        }
        
        return answer;
    }
}
