package exam01;

import java.util.Scanner;

// 배열 입력 과정을 삭제했는데도 불구하고 메모리 초과 발생
public class B2018_1 {
	//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		long[] sum = new long[n];
		
		sum[0] = 1;
		
		int cnt = 0;
		
		int start = 0;
		int end = 1;
		
		while(start!=n-1) {
			sum[end] = sum[end-1]+(end+1);
			if(sum[end]==n) cnt++;
			else if(sum[end]-sum[start]>n) {
				 start++;
			} else if(sum[end]-sum[start]==n) {
				System.out.println(start + " "+end);
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

