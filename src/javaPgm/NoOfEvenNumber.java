package javaPgm;

public class NoOfEvenNumber {
	public static void main(String[] args) {
		
		int num =0;
		int count =0;
		
		for(int i=0; i<30;i++) {
			
			if(i%2==0) {
				System.out.print(i + ", ");
				num = num+i;
				count =count+1;
			}
		}
		System.out.println(num);
		System.out.println(count);
	}



}
