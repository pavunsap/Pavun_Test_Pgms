package javaPgm;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String a[] = {"java","pavun","siva","pavun","siva"};
		
		
		for(int i=0; i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("Duplicate string is :"+a[i]);
				}
			}
			
			
		}
		
		
	}
}
