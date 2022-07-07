package exam01;

import java.util.Scanner;

// 배열 자체를 삭제하여 메모리 초과 피함
public class B2018_2 {
	//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int sum = 0;
		
		int cnt = 0;
		
		int start = 0;
		int end = 0;
		
		while(start!=n) {
			if(sum>n) {
				 start++;
				 sum -= start;
			} else if(sum==n) {
				//System.out.println(start + " "+end);
				cnt++;
				end++;
				start++;
				sum += end-start;
			} else if(sum<n) {
				end++;
				sum += end;
			} 		
		}
		System.out.println(cnt);
	}
}

