package exam01;

import java.io.*;
import java.util.*;

public class B10986 {
	//public class Main {
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int number = Integer.parseInt(st.nextToken());
		
		long[] sum = new long[size];
		long[] division = new long[number];
		
		st = new StringTokenizer(br.readLine());
		
		sum[0] = Integer.parseInt(st.nextToken());
		division[(int) (sum[0]%number)]++;
		
		for(int i=1; i<size; i++) {
			sum[i] = Integer.parseInt(st.nextToken())+sum[i-1];
			division[(int) (sum[i]%number)]++;
		}
		
		long answer = division[0];
		
		for(int i=0; i<number; i++) {
			if(division[i]>=2) {
				answer += division[i]*(division[i]-1)/2;
			}
		}
		System.out.println(answer);		
	}
}

