package javaPgm;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

	String s;
		Test(){	
		System.out.println("Constructor");
		}
		
		void mark() {
			
			System.out.println("marks");
			
		}
		public static void main(String[] args) {
			
			Test t = new Test();
			t.mark();
		}
}
