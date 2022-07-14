package exam01;

import java.util.Scanner;

public class B2908 {
	//public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();		
		String[] inputarr = input.split(" ");
		String[] one = inputarr[0].split("");
		String[] two = inputarr[1].split("");
				
		String newone = one[2]+one[1]+one[0];
		String newtwo = two[2]+two[1]+two[0];
		
		if(Integer.parseInt(newone) > Integer.parseInt(newtwo)) {
			System.out.println(Integer.parseInt(newone));
		} else System.out.println(Integer.parseInt(newtwo));		
	}
}	
