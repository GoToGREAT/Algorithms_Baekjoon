package exam01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1552 {
	//public class Main {
	public static void main(String[] args) {		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		try {
			int count = Integer.parseInt(bf.readLine());
			for(int i=0; i<count; i++) {
				String s = bf.readLine();
				StringTokenizer st = new StringTokenizer(s); 
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(a+b+"\n");				
			}	
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
