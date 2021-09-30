package programmers;

public class Maxnum_and_Minnum {
	public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        
        for(int i=1;i<arr.length;i++) {
            
            int a = Integer.parseInt(arr[i]);
            
            if(min > a) {
                min = a;
            }
            if(max < a) {
                max = a;
            }
        } // for
        
        answer = answer + Integer.toString(min) + " " + Integer.toString(max);
        
        return answer;
    }
}
