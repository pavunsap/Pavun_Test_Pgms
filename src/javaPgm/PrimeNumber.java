package javaPgm;

public class PrimeNumber {
	
	
//	Prime Number Logic is the given number should only 2 factors, only divisible by another and itself
//	And given number should be greater than 0
	
	public static void main(String[] args) {
		
		int num =13;
		int count =0;
		
		if(num>0) {
			
			for(int i=1; i<=num;i++) {
				
				if(num%i ==0)
					count++;
			}
			if(count==2) {
				
				System.out.println(num+" : "+ "is Prime Number");
			}
			else {
				
				System.out.println(num+" : "+ "is not a Prime Number");
			}
			
			
		}
		else {
			
			System.out.println(num+" : "+ "is not a Prime Number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
