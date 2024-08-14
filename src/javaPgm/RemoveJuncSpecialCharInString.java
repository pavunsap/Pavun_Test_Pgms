package javaPgm;

public class RemoveJuncSpecialCharInString {
	
	public static void main(String[] args) {
		
		String s = "!@#$%^ JAVA @#$%^&IPractice 23456789o";
		
		s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);
		
	}

}
