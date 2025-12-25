package CodePractice;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacter {

    public static void main(String[] args) {
        String str = "Selenium java";
        Map<String, Integer> mp = new HashMap<>();

        for (char ch : str.toCharArray()) {
        	String key;
        	if (ch == ' ') {
        	    key = "Blank";
        	} else {
        	    key = String.valueOf(ch);
        	}

            mp.put(key, mp.getOrDefault(key, 0) + 1);
        }

        System.out.println(mp);
    }
}
