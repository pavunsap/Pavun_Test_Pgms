package javaPgm;

public class rev {
	
	public static void main(String[] args) {
		
		String s = "My Name is Pavun";
		
		String[] words = s.split(" ");
		
		String reverseString = "";
		
		for(String w : words) {
			
			String reverseWord = "";
			
			for(int i=w.length()-1;i>=0;i--) {
				
				reverseWord = reverseWord+w.charAt(i);
				
			}
			reverseString=reverseString+reverseWord+" ";
			
		}
		System.out.println("ReverseString is :"+reverseString);
	}

}
