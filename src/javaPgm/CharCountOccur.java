package javaPgm;

import java.util.HashMap;
import java.util.Map;

public class CharCountOccur {
	public static void main(String[] args) {

		String s = "IEEE";

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			if (hm.containsKey(s.charAt(i))) {

				int count = hm.get(s.charAt(i));
				hm.put(s.charAt(i), ++count);
			} else {

				hm.put(s.charAt(i), 1);
			}

		}
		System.out.println("Charter is " + hm);

	}
}