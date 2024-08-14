package getterSetter;

public class AccountHolder {

	public static void main(String[] args) {
		
		Bank bb = new Bank();
		int min = bb.getMinimumBalance();
	
		System.out.println(min);
		
		bb.setMinimumBalance(2500);
		
		min = bb.getMinimumBalance();
	
		System.out.println(min);
	}
	

}
