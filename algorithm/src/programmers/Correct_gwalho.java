package programmers;

import java.util.*;

public class Correct_gwalho {

	 boolean solution(String s) {
	        boolean answer = false;

	        Stack<Character> stack = new Stack<>();
	        
	        for(int i=0;i<s.length();i++) {
	            
	            if(s.charAt(i) == '(') {
	                stack.push(s.charAt(i));
	            }
	            else {
	                if(stack.empty()) {
	                    return false;
	                }
	                stack.pop();
	            }
	        } //for
	        
	        if(stack.empty()) {
	            answer = true;
	        }
	        
	        return answer;
	    }
}