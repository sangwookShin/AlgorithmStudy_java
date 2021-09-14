package programmers;

import java.util.Arrays;

public class H_index {

	public int solution(int[] citations) {
        int answer = 0;
        int h;
        
        //정렬
        Arrays.sort(citations);
        
        for(int i=0;i<citations.length;i++) {
            
            h = citations.length - i;
            
            if(citations[i] >= h) {

                answer = h;
                break;
            }
            
            
        }//for
        
        return answer;
    }
	
}
