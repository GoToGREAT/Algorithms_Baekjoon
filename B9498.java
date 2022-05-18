package exam01;

import java.util.Scanner;

public class B9498 {
//public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		if(A/10>=9) {
			System.out.println('A');
		}
		else if(A/10==8) {
			System.out.println('B');
		}
		else if(A/10==7) {
				System.out.println('C');
		}
		else if(A/10==6) {
			System.out.println('D');
	}
		else {
			System.out.println("F");
		}
		
	}

}

