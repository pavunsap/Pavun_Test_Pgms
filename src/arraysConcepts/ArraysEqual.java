package arraysConcepts;

import java.util.Arrays;

public class ArraysEqual {
	
	public static void main(String[] args) {
		
		int[] a= {10,20,30};
		int[] b= {10,20,30};
		
//		int i=0;
//		boolean same = true;
//		
//		while(i<a.length) 
//		{
//			if(a[i]!=b[i]) {
//				
//				same = false;
//				System.out.println("Given array is not same");
//						
//			}
//			i++;
//		}
//		if(same==true) {
//			System.out.println("Given arrays are same");
//		}
		
		boolean same =	Arrays.equals(a, b);
		System.out.println(same);
		
		
		
		
	
	}

}