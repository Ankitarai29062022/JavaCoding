package CollectionCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IstNonRepeatingChar {

	public static void main(String[] args) {
		String str= "swiss";
		char c[]=str.toCharArray();
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		for(char d:c) {
			if(mp.containsKey(d)) {
			mp.put(d, mp.get(d)+1);
		}
			else {
				mp.put(d, 1);
			}
		}
		Set<Character>s=mp.keySet();
		for(char e:s) {
			if(mp.get(e)==1) {
				System.out.println("Non Repeating "+e);
				break;
			}
		}
	}

}
