package exam01;

import java.util.Scanner;

public class B2675 {
	//public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		for(int i=0; i<count; i++) {
			int num = scanner.nextInt();
			String S = scanner.nextLine().trim();
			String[] Sarr = S.split("");
			for(int t=0; t<S.length(); t++) {
				for(int k=0; k<num; k++) {
					System.out.print(Sarr[t]);
				}
			}			
			System.out.println();
		}		
	}
}
