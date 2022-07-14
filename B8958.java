package exam01;

import java.util.Scanner;

public class B8958 {
	//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		scanner.nextLine();
		for(int t=0; t<count; t++) {
			int sum = 0;
			String a = scanner.nextLine();
			String[] array = a.split("X");
			for(int i=0; i<array.length; i++) {
				if(array[i] != null) {
					for(int k=0; k<array[i].length(); k++) {
						sum += k+1;
					}				
				}
			}					
			System.out.println(sum);
		}	
		
	}
}
