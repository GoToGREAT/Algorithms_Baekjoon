package exam01;

import java.util.Scanner;

public class B1065 {
	//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int count = 0;
		for(int i=1; i<number+1; i++) {
			int num = i;
			if(num<100) {
				count++;
			} else if(num<1000){
				int a = num/100;
				int b = num%100/10;
				int c = num%10;				
				if((a-b) == (b-c)) {
					count ++;
				}						
			}			
		}
		System.out.println(count);
	}
}
