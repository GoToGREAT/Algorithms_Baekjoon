package exam01;

import java.util.Scanner;

public class B2577 {
//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int d = A*B*C; // A,B,C 곱한 값
		int e = d; // d의 자리 수 확인 하기 위해 사용
		int f = 0; // d의 자리 수
		while(e>0) {
			e=e/10;
			f++;
		} // 와일이 끝난 후 e는 0이 되고, f는 자리수가 된다.
		int[] line = new int[f]; // d의 각 자리 수 값		
		int[] count = new int[10];// 0~9까지 각 숫자 사용 횟수
		line[0] = d%10;  
		for(int i=1; i<(f-1); i++) {
			d = d/10;				
			line[i] = d%10;				
			}
		line[f-1] = d/10;
		
		for(int i=0; i<f; i++) {
			for(int k=0; k<10; k++) {
				if(line[i]==k) {
					count[k]++;}
									}
								}
		for(int i=0; i<10; i++) {
			System.out.println(count[i]);
		}
		 }			
	}


