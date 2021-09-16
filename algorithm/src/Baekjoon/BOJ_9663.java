package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BOJ_9663 {

	static int n;
	static int ans = 0;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
       
		arr = new int[n];
		backtracking(0);
		System.out.println(ans);
        
	} //main
	
	public static boolean possibleN(int c) {
		
		for(int i=0;i<c;i++) {
			
			if(arr[c] == arr[i]) { //같은 행에 놓이면 안됨
				return false;
			} //if
			else if(Math.abs(c -i) == Math.abs(arr[c] - arr[i])) { //대각선에 놓이면 안됨
				return false;
			}
		}
		
		return true;
	} //possibleN
	
	public static void backtracking(int r) {
 	   
		if(r == n) {
			ans++;
			return;
		}
		
		for(int i=0;i<n;i++) {
			arr[r] = i;
			if(possibleN(r)) {
				backtracking(r+1);
			}
		}  
    } //backtracking
	
}
