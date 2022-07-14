import java.io.*;
import java.util.*;

// 65%에서 시간 초과
public class B1253_3 {
	//public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int size = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			
			long[] arr = new long[size];
			for(int i=0; i<size; i++) {
				arr[i] = Long.parseLong(st.nextToken());
			}
			Arrays.sort(arr);
				
			boolean[] boo = new boolean[size];
				
			int count = 0;
			
			int now  = 0;
			
			
			for(int i=0; i<size-1; i++) {
				for(int q=i+1; q<size; q++) {					
					while(true) {
						now = q+1;
						long a = arr[i]+arr[q];
						if(a==arr[now]) {
							if(now != i && now != q && boo[now]==false) {
								boo[now]= true;
								count++;
							}
							break;
						} else if(arr[now-1]<a && arr[now]>a) break;
						else if(a>arr[now]) {
							now--;
						} else if(a<arr[now]) {
							now++;
						} else if(now<0 && now >size-1) break;						
					}					
					
					}
				}			
			System.out.println(count);			
	}
}