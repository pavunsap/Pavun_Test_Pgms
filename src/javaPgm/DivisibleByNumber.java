package javaPgm;

public class DivisibleByNumber {
	
	public static void main(String[] args) {
		
		int firstNum = 7;
		int lastNum = 35;
		int divisibleNum =3;
		
		for(int i = firstNum; i<= lastNum; i++) {
			
			if(i % divisibleNum == 0)
				System.out.print(i+ ",");		
			
		}
	}

}
