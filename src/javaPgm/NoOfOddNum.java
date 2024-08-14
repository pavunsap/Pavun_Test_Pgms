package javaPgm;

public class NoOfOddNum {
	
	public static void main(String[] args) {
			int num =0;
			int count =0;

			for(int i = 0; i < 29; i++) {
				
				if(i%2==1) {
					System.out.print(i + ", ");
					num = num+i;
					count =count+1;
				}
			}
			System.out.println(num);
			System.out.println(count);			
			
		}		
		
	}
