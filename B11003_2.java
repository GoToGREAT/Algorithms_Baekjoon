import java.io.*;
import java.util.*;

// while문을 삭제했지만 동일 문제 발생
public class B11003_2 {
	//public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int int_size = Integer.parseInt(st.nextToken());
			int need_size = Integer.parseInt(st.nextToken());
						
			st = new StringTokenizer(br.readLine());
			
			Deque<Node> de = new LinkedList<>();		
						
			for(int i=0; i<int_size; i++) {
				Node node = new Node(i, Integer.parseInt(st.nextToken()));
				if(i==0) {
					de.add(node);
				} else {
					if(de.getFirst().order <= i-need_size) {
						de.removeFirst();
					}	
					if(de.size()>0 && de.getLast().number >= node.number) {
						de.removeLast();
					}
					de.add(node);			
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
