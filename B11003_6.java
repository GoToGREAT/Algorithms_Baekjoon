import java.io.*;
import java.util.*;

public class B11003_6 {
	//public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int int_size = Integer.parseInt(st.nextToken());
			int need_size = Integer.parseInt(st.nextToken());
						
			st = new StringTokenizer(br.readLine());
			
			Deque<Noode> de = new LinkedList<>();		
						
			for(int i=0; i<int_size; i++) {
				// Node node = new Node(i, Integer.parseInt(st.nextToken()));
				int a = Integer.parseInt(st.nextToken());
				if(i==0) {
					de.add(new Noode(i, a));
				} else {
					if(de.getFirst().order <= i-need_size) {
						de.removeFirst();
					}					
					while(true) {
						if(de.size()>0 && de.getLast().number >= a) {
							de.removeLast();
						} else break;
						if(de.size()==0) break;
					}
					de.add(new Noode(i, a));			
				}
				System.out.print(de.getFirst().number+" ");
			}			
	}		
}
//디폴트만 가능 + 프라이빗과 퍼블릭 불가
class Noode{
	int order;
	int number;
	
	Noode(int order, int number){
		this.order = order;
		this.number = number;
	}
}	
