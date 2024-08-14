package javaPgm;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		
		
		int a[] = {9,0,3,-1,0,4,0,2,0};
		int temp;
		for(int i=0; i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]&& a[j]==0 && a[i]==0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int out:a) {
			System.out.print(out+" ");
		}
	}

	}
