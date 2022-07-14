import java.io.*;
import java.util.*;


public class B2941 {
	//public class Main {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputarr = input.split("");
		String[] croatia = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int count = 0;
		//int a=0;
		String change = ".";
		
		for(int k=0; k<inputarr.length; k++) {
			for(int i=0; i<croatia.length; i++) {
				if(input.contains(croatia[i])) {
					//System.out.println(a+" " +input);
					input = input.replaceFirst(croatia[i], change);
					//System.out.println(a+" " +input);
					//a++;
				}
			}
		}
		//System.out.println("input : "+input);
		String all[] = input.split("");
		count += all.length;
		for(int k=0; k<all.length; k++) {
			if(all[k].equals("-") || all[k].equals("=")) {
				count--;
			}
		}
		
		System.out.println(count);	
	}
}