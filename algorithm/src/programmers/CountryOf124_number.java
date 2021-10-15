package programmers;

public class CountryOf124_number {
	public String solution(int n) {
        String answer = "";
        String[] number = {"4", "1", "2"};
        
        while(n>0) {
            
            int a = n % 3;
            n = n / 3;
            
            if(a == 0) {
                n--;
            }
            
            answer = number[a] + answer;
        }
        
        
        return answer;
    }
}
