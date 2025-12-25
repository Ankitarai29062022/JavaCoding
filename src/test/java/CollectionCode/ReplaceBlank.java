package CollectionCode;

import java.util.HashMap;
import java.util.Map;

public class ReplaceBlank {

	public static void main(String[] args) {
		
		String str="My name is Ankita";
		char s[]=str.toCharArray();
   Map<String,Integer> mp=new HashMap<String,Integer>();
	for (char m : s) {
		String Key;
		if (m == ' ') {
			Key = "BLANK";

		} else {
			Key = String.valueOf(m);
		}

		if (mp.containsKey(Key)) {
			mp.put(Key, mp.get(Key) + 1);
		} else {
			mp.put(Key, 1);
		}
	}
	
	System.out.println(mp);
   

	}

}
