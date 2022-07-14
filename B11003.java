import java.io.*;
import java.util.*;

// 시간 초과 발생
public class B11003 {
	//public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int int_size = Integer.parseInt(st.nextToken());
			int need_size = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[int_size];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i=0; i<int_size; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
						
			HashMap<Integer, Integer> map = new HashMap<>();
			
			
			for(int i=0; i<int_size; i++) {
				if(i>=need_size) map.remove(i-need_size);
				map.put(i, arr[i]);
				List<Integer> list = new ArrayList<>(map.values());
				Collections.sort(list);
				
				System.out.print(list.get(0)+" ");
			}
			
	}
}