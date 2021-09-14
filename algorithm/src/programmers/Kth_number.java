package programmers;
import java.util.Arrays;

public class Kth_number {

	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i, j, k;
        
        for(int p=0;p<commands.length;p++) {
            
            i = commands[p][0] -1;
            j = commands[p][1];
            k = commands[p][2] -1;
            int[] tmp = Arrays.copyOfRange(array, i, j);
   
            Arrays.sort(tmp);
            
            answer[p] = tmp[k]; 
        }
        
        return answer;
    }
}
