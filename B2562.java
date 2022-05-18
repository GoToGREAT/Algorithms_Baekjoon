package exam01;

import java.util.Scanner;

public class B2562 {
//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] line = new int[9];
		int a=0;
		for(int i=0; i<9; i++) {
			 line[i] = scanner.nextInt();
		 }
		for(int i=0; i<9; i++) {
			 if(line [i]>a) {
				 a = line [i];
				  }
		 }	
		for(int i=0; i<9; i++) {
			 if(line [i]==a) {
				 System.out.println(a);
				 System.out.println(i+1);				  }
		 }			
	}
}

