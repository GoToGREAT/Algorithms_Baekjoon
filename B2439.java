package exam01;

import java.util.Scanner;

public class B2439 {
//public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=1; i<=N; i++) {	
			for(int b=1; b<=N-i;b++) {
				System.out.print(' ');	}
			for(int a=1; a<=i; a++  ) {
				System.out.print('*');	
			}
			
			System.out.println();		
		}

}
}

