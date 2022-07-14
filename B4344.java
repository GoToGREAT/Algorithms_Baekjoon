package exam01;

import java.util.Scanner;

public class B4344 {
// public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(a);
		for(int i=0; i<a;i++) {
			int b = scanner.nextInt();
			int[] score = new int[b];
			float sum = 0, c =0;
			for(int k=0; k<b ;k++) {
				score[k] = scanner.nextInt();
								 }
			for(int k=0; k<b; k++) {
				sum += score[k];
			}
			for(int k=0; k<b; k++) {
				if(score[k]>(score[k]/b)) {
					c++;
				}
			}
			System.out.println(((c/b)*100)+"%");
			
		   }
				
	}

}
