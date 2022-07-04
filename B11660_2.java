package exam01;

import java.io.*;
import java.util.*;

//버퍼 리더 사용 : 채점 속도가 빨라짐
//정답
public class B11660_2 {
//public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		
		int[][] array = new int[size+1][size+1];		
		
		for(int i=1; i<=size; i++) {
			st = new StringTokenizer(br.readLine());
			for(int q=1; q<=size; q++) {
				array[i][q] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] sum = new int[size+1][size+1];
		
		for(int i=1; i<=size; i++) {
			for(int q=1; q<=size; q++) {
				sum[i][q] = sum[i-1][q]+sum[i][q-1]+array[i][q]-sum[i-1][q-1];
			}
		}
	
		for(int i=0; i<count; i++) {
				st = new StringTokenizer(br.readLine());
				int x1 = Integer.parseInt(st.nextToken());
				int y1 = Integer.parseInt(st.nextToken());
				int x2 = Integer.parseInt(st.nextToken());
				int y2 = Integer.parseInt(st.nextToken());
				
				if(x1==x2 && y1==y2) {
					System.out.println(array[x1][y1]);
				} else {
					System.out.println(sum[x2][y2]+sum[x1-1][y1-1]
							-sum[x1-1][y2]-sum[x2][y1-1]);
				}	
		}
	}
}

