package javaPgm;

public class Armstrong {

	public static void main(String[] args) {
			
		int num		=	153; 
		int num2	=	num;
		int arms 	= 	0;
		int rem 	=	0;
		while(num>0) {
			
			rem = num%10; 				// taking last digit so that rem is 3 here
			arms = arms+(rem*rem*rem); 	// 0+(3*3*3)
			num = num/10;				//if we divide we will get number without last digit so that the num is 15 here
		
		}
		if(num2 == arms) {
		System.out.println(arms+ "is Armstromg Number");
		
	}
		else {
			System.out.println(arms+ "is not a Armstromg Number");
		}
		
	}

}
