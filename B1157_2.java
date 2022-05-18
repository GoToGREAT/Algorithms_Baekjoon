package exam01;

import java.util.Scanner;

public class B1157_2 {
	//public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine().toUpperCase(); // 입력 문자
		String[] inputarr = input.split("");
		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 알파벳 대문자
		String[] alphabet = Alphabet.split(""); // 알파벳 자르기
		int[] count = new int[alphabet.length]; // 알파벳 별 숫자 세기
		int max = 0;
		int number = 0;
 		for(int i=0; i<alphabet.length; i++) {
 			for(int k=0; k<input.length(); k++) {
 				if (alphabet[i].equals(inputarr[k])) {
 					count[i] += 1;  // 입력 문자 알파벳 별 포함 횟수 세기
 					if(max < count[i]) {
 		 				max = count[i]; // 가장 많이 포함 된 숫자 세기
 		 			}
 				}
 			}
		}	 		
 		
 		for(int i=0; i < alphabet.length; i++) {
 			if(max == count[i]) {
 				number++; // 가장 많이 포함 된 숫자가 몇 개인지 세기
 			}
 		}
 		
 		if(number>1) {
 			System.out.println("?");
 		}
 		else if (number==1) {
 			for(int i=0; i < alphabet.length; i++) {
 	 			if(max == count[i]) { // 가장 많이 포함 된 문자 출력
 	 				System.out.println(alphabet[i]);
 	 			}
 	 		}
 		}
			
	}
}
