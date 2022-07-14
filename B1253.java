package exam01;

import java.io.*;
import java.util.*;

public class B1253 {
	//public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		boolean[] boo = new boolean[size];
		
		int count = 0;
		
		for(int i=0; i<size-2; i++) {
			for(int q=i+1; q<size-1; q++) {
				for(int w=q+1; w<size; w++) {
					if(boo[w]==true) continue;
					if(arr[i]+arr[q]==arr[w]){
						boo[w]=true;
						count++;
						}
				}
			}
		}
		System.out.println(count);
	}
}

