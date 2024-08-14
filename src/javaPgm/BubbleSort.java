package javaPgm;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int a[] = {10,2,4,7,3,1,8};
		
		System.out.println("Before sorting array is :"+Arrays.toString(a));
		
		int len = a.length;
		
		for(int i=0; i<len-1;i++) {
			
			for(int j=0;j<len-1;i++) {
				
				if(a[j]<a[j+1]) {
					
					int temp=a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
				
			}
			
		}
		System.out.println("After sorting array is :"+Arrays.toString(a));
		
		
		
	}

}
