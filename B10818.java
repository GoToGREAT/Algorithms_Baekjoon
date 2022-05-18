package exam01;

import java.util.Scanner;

public class B10818 {
//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int a=1000000, b=-1000000;
		 int[] line = new int[N];
		 for(int i=0; i<N; i++) {
			 line[i] = scanner.nextInt();
		 }
		 for(int i=0; i<N; i++) {
			 if(line [i]<a) {
				 a = line [i];
				  }
			 if (line [i]>b) {
				 b = line [i];
			 }
		 }	
		 System.out.println(a+" "+b);
		
	}
}

