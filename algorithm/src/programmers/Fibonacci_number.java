package programmers;

public class Fibonacci_number {

	public int solution(int n) {
        int answer = 0;
        int[] dp = new int[100001];
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        for(int i=3;i<100001;i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        
        answer = dp[n];
        
        return answer;
    }
}
