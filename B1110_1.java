package exam01;

import java.util.Scanner;

public class B1110_1 {
		//public class Main { // 오류 수정 완료
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int a=0, b=-1, C=0;
		a = A;		
		while (b != A) {
			a=(((a/10)+(a%10))%10)+((a%10)*10);
			b=a;
			C++;
		}
		System.out.println(C);	
		}
	}
