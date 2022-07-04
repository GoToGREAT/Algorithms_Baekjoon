package exam01;

import java.util.*;

//x1,y1 / x2,y2 값을 받자마자 결과값을 도출하니 오답은 뜨지 않음.
//단 런타임 에러 발생
public class B11660_1 {
//public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int count = scanner.nextInt();
		
		int[][] array = new int[size+1][size+1];		
		
		for(int i=1; i<=size; i++) {
			for(int q=1; q<=size; q++) {
				array[i][q] = scanner.nextInt();
			}
		}
		
		int[][] sum = new int[size+1][size+1];
		
		for(int i=1; i<=size; i++) {
			for(int q=1; q<=size; q++) {
				sum[i][q] = sum[i-1][q]+sum[i][q-1]+array[i][q]-sum[i-1][q-1];
			}
		}
	
		for(int i=0; i<count; i++) {			
				int x1 = scanner.nextInt();
				int y1 = scanner.nextInt();
				int x2 = scanner.nextInt();
				int y2 = scanner.nextInt();
				
				if(x1==x2 && y1==y2) {
					System.out.println(array[x1][y1]);
				} else {
					System.out.println(sum[x2][y2]+sum[x1-1][y1-1]
							-sum[x1-1][y2]-sum[x2][y1-1]);
				}	
		}
	}
}

