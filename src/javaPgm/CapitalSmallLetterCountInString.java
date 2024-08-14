package javaPgm;

public class CapitalSmallLetterCountInString {

		public static void main(String[] args) {
			
			String s = "Pavun Is My NaMe";
			int count = 0;
			
			for(char c : s.toCharArray()) {
				
				if(Character.isUpperCase(c)) {
					
					count++;
				}			
			}
				System.out.println(count);	
	
	}

}
