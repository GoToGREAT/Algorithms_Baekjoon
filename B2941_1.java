import java.io.*;
import java.util.*;

public class B2941_1 {
	//public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String s = br.readLine();
		
		String[] arr = s.split("");
		
		
		List<String> slist = new ArrayList<>();
		slist.add("c");
		slist.add("d");
		slist.add("l");
		slist.add("n");
		slist.add("s");
		slist.add("z");
		
		List<String> list = new ArrayList<>();
		list.add("c=");
		list.add("c-");
		list.add("dz=");
		list.add("d-");
		list.add("lj");
		list.add("nj");
		list.add("s=");
		list.add("z=");
			
		int start = 0;		
		int count = 0;
		
		while(true) {			
			if(slist.contains(arr[start])) {
				if(start<=arr.length-2 && list.contains(arr[start]+arr[start+1])) {
					count++;
					start += 2;
				} else if(start<=arr.length-3 && list.contains(arr[start]+arr[start+1]+arr[start+2])) {
					count++;
					start +=3;
				} else {
					count++;
					start++;
				}
				
			} else {
				count++;
				start++;
			}
			if(start == arr.length) break;
		}
		
		System.out.println(count);
	}
}