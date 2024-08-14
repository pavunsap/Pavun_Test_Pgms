package arraysConcepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SuffleArrayUsingCollections {
	
	public static void main(String [] args) {
		
		
		Integer [] arr = {2,4,7,3,5,1};
		
		List<Integer>list = Arrays.asList(arr);
		Collections.shuffle(list);
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
