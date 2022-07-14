import java.io.*;
import java.util.*;

// sysout 대신 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 사용
// 6%에서 100% 됨.
// 정답
public class B11003_3 {
	//public class Main {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int int_size = Integer.parseInt(st.nextToken());
			int need_size = Integer.parseInt(st.nextToken());
						
			st = new StringTokenizer(br.readLine());
			
			Deque<Node> de = new LinkedList<>();		
			
			//새롭게 추가
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
						
			for(int i=0; i<int_size; i++) {
				Node node = new Node(i, Integer.parseInt(st.nextToken()));
				if(i==0) {
					de.add(node);
				} else {
					if(de.getFirst().order <= i-need_size) {
						de.removeFirst();
					}					
					while(true) {
						if(de.size()>0 && de.getLast().number >= node.number) {
							de.removeLast();
						} else break;
						if(de.size()==0) break;
					}
					de.add(node);			
				}
				bw.write(de.getFirst().number+" ");
			}

			bw.flush();
			bw.close();
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
