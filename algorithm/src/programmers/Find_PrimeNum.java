package programmers;

import java.util.*;

public class Find_PrimeNum {
	int answer = 0;
    boolean []visit = new boolean[10];
    ArrayList<Integer> arr = new ArrayList<>();
    
    void DFS(String s, String tmp, int m) {
        
        if(tmp.length() == m) {
            int num = Integer.parseInt(tmp);
            if(!arr.contains(num)) {
                arr.add(num);
            }
            return;
        }
        else {
            for(int i=0;i<s.length();i++) {
                if(visit[i] == false) {

                    visit[i] = true;
                    tmp = tmp + s.charAt(i);
                    DFS(s, tmp, m);
                    visit[i] = false;
                    tmp = tmp.substring(0, tmp.length()-1);
                }
            }
        } //else   
    }
    
    void is_prime(int n) {
        if(n<=1) {
            return;
        }
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return;
            }
        }
        answer++;
    } //if_prime
    
    public int solution(String numbers) {
        
        String tmp = "";
        
        for(int i=0;i<numbers.length();i++) {
            DFS(numbers, tmp, i+1);
        }
        for(int i=0;i<arr.size();i++) {
            is_prime(arr.get(i));
        }
        
        return answer;
    }
}
