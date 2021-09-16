package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_15651 {

	static int n;
	static int m;
	static int arr[];
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		dfs(0);
		
		br.close();
		bw.flush();
		bw.close();
	} //main
	
	static void dfs(int cnt) throws IOException {
		//출력부가 있기 때문에 bw객체를 사용할 때에는 입출력 예외처리가 필수
		
		if(cnt == m) {
			for(int i=0;i<m;i++) {
				bw.write(String.valueOf(arr[i] + " "));
			}
			bw.newLine(); //개행
			return;
		} //if
		
		for(int i=1;i<=n;i++) {
			arr[cnt] = i;
			dfs(cnt+1);
		} //for
		
	} //dfs

}
