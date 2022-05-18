package exam01;

import java.util.Scanner;

public class B1110 {//정답은 같지만 백준이 오케이 안해줌 - 수정 완료
		//public class Main {
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			int A = scanner.nextInt();
			int test = A;
			int f = -1;
			int count = 0;
			// 처음부터 A가 0일 경우 오류가 생김
			while(f != A) {
				test = (((test/10)+(test%10))%10)+(test%10)*10;
				f = test;
				count++;
			}
			
			System.out.println(count);		
	}
}
