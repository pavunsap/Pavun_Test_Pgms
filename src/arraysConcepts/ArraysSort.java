package arraysConcepts;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {
	
	public static void main(String[] args) {
		
		
		int [] a = {1,2,6,3,7,9,5,8,3,};
		
		System.out.println("Before Sorting");	
		for(int i : a)
			System.out.println(i);
		
			Arrays.sort(a);
		
			System.out.println("After Sorting");
			for(int i:a)
				System.out.println(i);
			
			String[] s = {"Vijay","Ama","Sanju","Praveen","Zeenat"};
			
			System.out.println("Before Sorting");
			for(String i:s)
				System.out.println(i);
					
			
			Arrays.sort(s);
			
			System.out.println("After Sorting");
			for(String i:s)
				System.out.println(i);
			
//			Dynamic Binding
			
			Comparator comp = new ComparatorDemo();
			
			Arrays.sort(s, comp);
			System.out.println();
			System.out.println("************After Sort by length");
			for(String i:s)
				System.out.println(i);
		
		
	}

}
