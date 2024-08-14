package javaPgm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
	public static void main(String[] args) {
		
		String s = "Pavunkumar";
		int len = s.length();
		System.out.println(len);
		String rev = "";
		for(int i = len-1; i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		String s1 = "Ramkumar";
		StringBuffer sf = new StringBuffer(s1);
		System.out.println(sf.reverse());
		
		
	}

}
