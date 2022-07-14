package exam01;

import java.util.Scanner;

public class B10809 {
	//public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		
		String Alphabet = "abcdefghijklmnopqrstuvwxyz";
		for(int i=0; i<Alphabet.length(); i++) {
			String[] alphabet = Alphabet.split("");
			System.out.println(S.indexOf(alphabet[i]));
		}
	}
}
