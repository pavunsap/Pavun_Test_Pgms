package javaPgm;

public class Constructor {
	
	private int myVariable;

	
	private Constructor(int value) {
		
		this.myVariable = value;
	}
	
	public void printVaribale() {
		System.out.println("My Variable is: "+ this.myVariable);
	}

	public static void main(String[] args) {
		
		Constructor obj = new Constructor(12);
		obj.printVaribale();
	}
	

}

