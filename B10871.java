package exam01;

import java.util.Scanner;

public class B10871 {
//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		 int[] line = new int[N];
		 for(int i=0; i<N; i++) {
			 line[i] = scanner.nextInt();
		 }
		 for(int i=0; i<N; i++) {
			 if(line [i]<X) {
				 System.out.print(line[i]+" ");
			 }
		 }	
		
	}
}

