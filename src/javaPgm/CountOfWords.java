package javaPgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CountOfWords {
	public static void main(String[] args) {
		
	        String[] ar = {"siddhant", "suraj", "aman", "shubham", "anuj", "amit", "Pavun"};
	        Arrays.sort(ar, Comparator.comparing(String::length)); // Sort array based on string length

	        Map<Integer, ArrayList<String>> map = new HashMap<>();

	        // Group strings based on their lengths
	        for (String str : ar) {
	            int len = str.length();
	            if (!map.containsKey(len)) {
	                map.put(len, new ArrayList<>());
	            }
	            map.get(len).add(str);
	        }

	        // Print grouped strings
	        for (Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
	            System.out.print(entry.getKey() + " - ");
	            System.out.println(String.join(", ", entry.getValue()));
	        }
	    }

	}

