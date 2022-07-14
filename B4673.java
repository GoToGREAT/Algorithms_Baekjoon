package exam01;

import java.util.ArrayList;
import java.util.List;

public class B4673 {
//	public class Main {
	public static void main(String[] args) {
		List<Integer> list = drk();
	
		for(int i=1; i<10000; i++) {
			if(list.contains(i)!=true) {
				System.out.println(i);
			}
			
		}
	}

	static List<Integer> drk(){
		List<Integer> list = new ArrayList<Integer>();
		for(int a=0; a<10; a++) {
			for(int b=0; b<10; b++) {
				for(int c=0; c<10; c++) {
					for(int d=0; d<10; d++) {
						list.add(1001*a+101*b+11*c+2*d);
					}
				}
			}
		}		
		return list;
	}
	
}
	

