package exam01;

import java.util.Scanner;

public class B11022 {
//public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for(int i=0; i<T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println("Case #"+(i+1)+": "+(A+B));		
		}

}
}

