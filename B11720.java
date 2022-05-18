package exam01;

import java.util.Scanner;

public class B11720 {
	//public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		scanner.nextLine();
		
		int sum=0;
		String input = scanner.nextLine();
		for(int i=0; i<count; i++) {
			String[] charinput = input.split("");
			int intinput = Integer.parseInt(charinput[i]);
			sum += intinput;
		}
		System.out.println(sum);		
	}
}
