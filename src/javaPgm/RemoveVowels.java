package javaPgm;

public class RemoveVowels {

	public static void main(String[] args) {
		
		String str = "My Name Is Pavun";
		
		String vowels = "aeiouAEIOU";
		
		String output = "";
		for(char c: str.toCharArray()) {
			if(vowels.indexOf(c) == -1) {
				output = output+c;
			}
		}
		System.out.println(output);
	}

}
