package exam01;

import java.util.Scanner;

public class B2480 {
//public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a  = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int samecount = 0;
		int samenum = 0;
		
		if(a==b) {
			samecount++;
			samenum=a;
		} if(a==c) {
			samecount++;
			samenum=a;
		} if(b==c) {
			samecount++;
			samenum=b;
		}
		
		if(samecount == 0) {
			if(a>=b) {
				if(a>=c) {
					System.out.println(a*100);
				} else {
					System.out.println(c*100);
				}
			}
			if(a<b) {
				if(b>=c) {
					System.out.println(b*100);
				} else {
					System.out.println(c*100);
				}
			}
			
			
		} else if(samecount == 1) {
			System.out.println(1000+samenum*100);
		} else if(samecount == 2 | samecount == 3) {
			System.out.println(10000+samenum*1000);
		}
		
	
	}

}


