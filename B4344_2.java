package exam01;

import java.util.Scanner;

public class B4344_2 {
// public class Main{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int c = scanner.nextInt();
	for (int k = 0; k<c; k++) {
	int a = scanner.nextInt();
	int[] score = new int[a];
	int sum = 0, count = 0 ;
	for(int i=0; i<a; i++) {
		score[i] = scanner.nextInt();
		sum += score[i];
	}
	double average = sum/a;
	for(int i=0; i<a; i++) {
		if(score[i]>average) {
			count++;
		}
	}
	double percentage = (count*1000000)/a;
	percentage = percentage/10000;
	System.out.println(String.format("%.3f",percentage)+"%");
	// 소수점 아래 3번째 숫자까지 나타내는 방법 + 자동 반올림
	// 40.0 과 40.000 표현 방법의 차이 
	}
						
	}

}