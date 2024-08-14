package getterSetter;

public class Bank {

	
	int minimumBalance =2400;
	
	public int getMinimumBalance() {
		
		
		return this.minimumBalance;
		
	}
	
	public void setMinimumBalance(int value) {
		
		if(value>2500)
			this.minimumBalance = value;
		
	}
}
