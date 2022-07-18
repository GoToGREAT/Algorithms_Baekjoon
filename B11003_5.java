import java.io.*;
import java.util.*;

public class B11003_5 {
	//public class Main {
	public static void main(String[] args) throws IOException {
		// static main 내부에 디폴트로 작성시 아래에서 정의하면 오류 발생 / 존재하지 않는 클래스를 사용하기 때문에
		class Nodee{
			int order;
			int number;
			
			Nodee(int order, int number){
				this.order = order;
				this.number = number;
			}
		}
		
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int int_size = Integer.parseInt(st.nextToken());
			int need_size = Integer.parseInt(st.nextToken());
						
			st = new StringTokenizer(br.readLine());
			
			Deque<Nodee> de = new LinkedList<>();		
			
			//새롭게 추가
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
						
			for(int i=0; i<int_size; i++) {
				Nodee node = new Nodee(i, Integer.parseInt(st.nextToken()));
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
		

}
