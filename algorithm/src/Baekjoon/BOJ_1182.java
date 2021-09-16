package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1182 {

	static int n;
	static int s;
	static int[] arr;
	static int cnt =0;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} //for
		
		if(s==0) {
			cnt--;
		}
		
		backtracking(0, 0);
		
		System.out.println(cnt);
	} //main

	static void backtracking(int index, int sum) {
		
		if(index == n) {
			if(sum == s) {
				cnt++;
			}
			return;
		} //if
		
		backtracking(index + 1, sum);
		backtracking(index + 1, sum + arr[index]);
	}
} //BOJ_1182
