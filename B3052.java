package exam01;

import java.util.Scanner;

public class B3052 {
//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] scan = new int[10];
		int[] count = new int[42];
		int c=0;
//		for(int i=0; i<42;i++) {
//			count[i]=0;
//		} 배열 초기화는 의무가 아니었음
		for(int i=0; i<10; i++) {
			scan[i]=scanner.nextInt();
			scan[i]=scan[i]%42;
			for(int k=0; k<42; k++)
			{	
				if (scan[i]==k){
				count[k]++;		}
				
			}
								}
		for(int k=0;k<42;k++) {
			if(count[k]!=0) {
				c++;
			}
		}
		System.out.println(c);	
		 }			
	}


