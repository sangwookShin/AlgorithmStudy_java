package programmers;

public class Carpet {

	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int w, h;
        int total = brown + yellow;
        
        for(int i=1;i<=total;i++) {
            
            w = i;
            h = total / w;
            
            if(w<h) {
                continue;
            }
            
            if((w-2) * (h-2) == yellow) {
                answer[0] = w;
                answer[1] = h;
            }
        }
        
        return answer;
    }
	
}
