package exam01;

import java.util.Scanner;

public class B1546 {
//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		double b=0, c=0; // 받은 점수 중 최댓값
		double [] score = new double[a];
		for(int i=0; i<a; i++) {
			score[i]=scanner.nextInt();
			}
		for(int i=0; i<a; i++) {
			if(b<score[i]) {
				b = score[i];
			}
			}
		
		for(int i=0; i<a; i++) {
			score[i] = (score[i]/b)*100 ;
			c = c+score[i];
		}
		System.out.println(c/a);
		 }			
	}


