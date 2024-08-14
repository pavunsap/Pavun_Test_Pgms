package javaPgm;

public class NumberPositionNotChange {

	public static void main(String[] args) {
	 int a[]= {-1,0,-4,5,0,7,3};
	 int temp=0;
	 for(int i=0;i<=a.length;i++) {
		 
		 for(int j=i;j<=a.length-1;j++) {
			 
			 if(a[i]>a[j] && a[j]!=0 && a[i]!=0) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			 }
		 }
		 
	 }
	 for(int out:a) {
		 System.out.print(out+",");
	 }
	}
}
