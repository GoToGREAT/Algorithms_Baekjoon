import java.io.*;
import java.util.*;

public class B12891_1 {
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
			
			int A = 0;
			int C = 0;
			int G = 0;
			int T = 0;
			
			for(int i=0; i<need_size; i++) {
					if(s.charAt(i)==65) A++;
					else if(s.charAt(i)==67) C++;
					else if(s.charAt(i)==71) G++;
					else T++;
			}
			
			if(A>=a && C>=c && G>=g && T>=t) find++;
			
			for(int i=1; i<=str-need_size; i++) {
				if(s.charAt(i-1)==65) A--;
				else if(s.charAt(i-1)==67) C--;
				else if(s.charAt(i-1)==71) G--;
				else T--;
				
				if(s.charAt(i+need_size-1)==65) A++;
				else if(s.charAt(i+need_size-1)==67) C++;
				else if(s.charAt(i+need_size-1)==71) G++;
				else T++;
				
				if(A>=a && C>=c && G>=g && T>=t) find++;
			}
			
			System.out.println(find);
	}
}