package javaPgm;
import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
	String[] Arraysort = {"Jan", "feb","Mar","dec","may"};
	
	Arrays.sort(Arraysort);
	
	for(String NewStringArray : Arraysort) {
		
		System.out.print(NewStringArray+ " ");	
		
	}
	Arrays.sort(Arraysort, String.CASE_INSENSITIVE_ORDER);
	System.out.println();	
	System.out.println( "++++++++++++++++++++++++ ");		
	
	for(String NewStringArray : Arraysort) {
		
		System.out.print(NewStringArray+ " ");	
		
	}

}
}