package singletonClass;

public class AccessClassObj {
	 
	public static void main(String[] args) {
		
		SingletonClass obj = SingletonClass.getInstance();
		SingletonClass obj1 = SingletonClass.getInstance();
	}

}
