package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 원인 모르게 오답이라고만 뜸
public class B11660 {
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
		
		List<Integer[]> question = new ArrayList<>();
		
		for(int i=0; i<count; i++) {
			Integer[] q = new Integer[4];
			for(int a=0; a<4; a++) {
				q[a] = scanner.nextInt();
			}
			question.add(q);
		}
		
		int[][] sum = new int[size+1][size+1];
		
		for(int i=1; i<=size; i++) {
			for(int q=1; q<=size; q++) {
				sum[i][q] = sum[i-1][q]+sum[i][q-1]+array[i][q]-sum[i-1][q-1];
			}
		}
		
		for(int i=0; i<count; i++) {
			Integer[] que = question.get(i);
			if(que[0]==que[2] && que[1]==que[3]) {
				System.out.println(array[que[0]][que[1]]);
			} else {
				System.out.println(sum[que[2]][que[3]]+sum[que[1]-1][que[2]-1]
						-sum[que[1]-1][que[3]]-sum[que[2]][que[1]-1]);
			}			
		}
	}
}

