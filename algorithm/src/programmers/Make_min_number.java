package programmers;
import java.util.*;
public class Make_min_number {
	public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0;i<A.length;i++) {
                answer += A[i] * B[A.length-i-1];
        }
        
        return answer;
    }
}
