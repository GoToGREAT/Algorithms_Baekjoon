import java.io.*;
import java.util.*;

// 시작과 동시에 node 만드는 것 없애봄.
// 시간초과 발생
// sysout이 문제 확실시 됨.

public class B11003_4 {
	//public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int int_size = Integer.parseInt(st.nextToken());
			int need_size = Integer.parseInt(st.nextToken());
						
			st = new StringTokenizer(br.readLine());
			
			Deque<Node> de = new LinkedList<>();		
						
			for(int i=0; i<int_size; i++) {
				// Node node = new Node(i, Integer.parseInt(st.nextToken()));
				int a = Integer.parseInt(st.nextToken());
				if(i==0) {
					de.add(new Node(i, a));
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
					de.add(new Node(i, a));			
				}
				System.out.print(de.getFirst().number+" ");
			}			
	}		
	static class Node{
			int order;
			int number;
			
			Node(int order, int number){
				this.order = order;
				this.number = number;
			}
		}	
}
