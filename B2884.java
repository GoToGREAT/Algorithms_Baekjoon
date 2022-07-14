package exam01;

import java.util.Scanner;

public class B2884 {
//public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		M = M-45;		
		if(M<0) {
			--H;
			M = M+60;
			if(H<0) {
				H = H+24;
			}
		}
		System.out.print(H+" ");
		System.out.print(M);
	}
}

