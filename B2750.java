package exam01;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class B2750 {
	//public class Main {
	  public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = Integer.parseInt(st.nextToken());
		
		int[] a = new int[count];
		
		for(int k=0; k<count; k++) {
			st = new StringTokenizer(br.readLine());
			a[k] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);	
		
		for(int i=0; i<count; i++) {
			System.out.println(a[i]);
		}
		
		
	}
}
