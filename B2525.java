package exam01;

import java.util.Scanner;

public class B2525 {
//public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour  = scanner.nextInt();
		int minute = scanner.nextInt();
		int during = scanner.nextInt();
		
		minute += during;
		if(minute/60 >= 1) {
			hour += minute/60;
			minute %= 60;
		}
		hour %= 24;
		System.out.println(hour+" "+minute);
	}

}


