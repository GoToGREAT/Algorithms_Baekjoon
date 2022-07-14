import java.io.*;
import java.util.*;

// 시간초과
public class B12891 {
	//public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int str = Integer.parseInt(st.nextToken());
			int need_size = Integer.parseInt(st.nextToken());
			
			String s = br.readLine();
			
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			
			int find = 0;
			
			for(int i=0; i<str-need_size; i++) {
				int A = 0;
				int C = 0;
				int G = 0;
				int T = 0;
				for(int q=i; q< i+need_size; q++) {
					if(s.charAt(q)==65) A++;
					else if(s.charAt(q)==67) C++;
					else if(s.charAt(q)==71) G++;
					else T++;
				}
				if(A>=a && C>=c && G>=g && T>=t) find++;
			}
			
			System.out.println(find);
	}
}