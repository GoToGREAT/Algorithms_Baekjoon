package exam01;

import java.io.*;
import java.util.*;

public class B1940 {
	//public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int sum = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		
		int start= 0;
		int end = size-1;
		
		while(start<end) {
			if(arr[start]+arr[end]==sum) {
				cnt++;
				start++;
				end--;
			} else if(arr[start]+arr[end]<sum){
				start++;
			} else {
				end--;
			}
		}
		System.out.println(cnt);		
	}
}

