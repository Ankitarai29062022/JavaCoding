package CollectionCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class firstnonrepeatingchar {

	public static void main(String[] args) {
	//swiss output w
		String str="swiiuiueuoeifoefjdlvndvljfoiououoss";
		char c[]=str.toCharArray();
		Map<Character,Integer> mp=new LinkedHashMap<Character,Integer>();
		for(char d:c) {
			
				if (mp.containsKey(d)) {
					mp.put(d, mp.get(d) + 1);

				} else {
					mp.put(d, 1);
				}
			}
			System.out.println(mp);
//			for(Entry<Character,Integer> en:mp.entrySet()) {
//				if(en.getValue()==1) {
//				System.out.println(en.getKey()+"  "+en.getValue());
//				break;
//				}
				
//}
			
			Set<Character> st=mp.keySet();
			for(char j:st) {
			if(mp.get(j)==1) {
				System.out.println(j +" "+mp.get(j));
				break;
			}

}}
}