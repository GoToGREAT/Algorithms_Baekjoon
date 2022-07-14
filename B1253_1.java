package exam01;

import java.io.*;
import java.util.*;

// 시간 초과
public class B1253_1 {
	//public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		long[] arr = new long[size];
		for(int i=0; i<size; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		if(size<3) {
			System.out.println(0);
		}
		
		Arrays.sort(arr);
		
		boolean[] boo = new boolean[size];
		
		int count = 0;
		
		for(int i=0; i<size; i++) {
			for(int q=0; q<size; q++) {
				if(i==q) continue;
				for(int w=0; w<size; w++) {
					if(i==w || q==w) continue;
					if(arr[i]+arr[q]<arr[w]) break;
					if(boo[w]==true) continue;
					else if(arr[i]+arr[q]==arr[w]){
						boo[w]=true;
						count++;
						}
				}
			}
		}
		System.out.println(count);
	}
}

