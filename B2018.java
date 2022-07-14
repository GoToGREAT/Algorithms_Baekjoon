package exam01;

import java.util.Scanner;

// 정답은 나오지만 메모리 초과 발생
public class B2018 {
	//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		long[] sum = new long[n];
		
		sum[0] = 1;
		
		int cnt = 0;
		
		int start = 0;
		int end = 0;
		
		for(int i=1; i<n; i++) {
			sum[i] = sum[i-1]+(i+1);
			if(sum[i]==n) cnt++;
			if(end==0 && sum[i]>=n) {
				end = i;
			}
		}
		
		while(start!=n-1) {
			if(sum[end]-sum[start]>n) {
				 start++;
			} else if(sum[end]-sum[start]==n) {
				cnt++;
				end++;
				start++;
			} else if(sum[end]-sum[start]<n) {
				end++;
			} 		
		}
		System.out.println(cnt);
	}
}

