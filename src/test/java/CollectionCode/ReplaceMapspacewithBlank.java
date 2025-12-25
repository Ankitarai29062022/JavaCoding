package CollectionCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ReplaceMapspacewithBlank {

	public static void main(String[] args) {
		String str="Sssseleniiiiiiiium java";
		char c[]=str.toCharArray();
		Map<Character ,Integer> mp=new HashMap<Character,Integer>();
		for(char d:c) {
		if(mp.containsKey(d)) {
			mp.put(d, mp.get(d)+1);
		}
		else {
			mp.put(d, 1);
		}}
	

for(Map.Entry<Character, Integer> mn:mp.entrySet()) {
			
		
			if(mn.getValue()==1) {
				//m.getValue();
				System.out.println(mn.getKey());
				break;
			}
		}
		
//		int maxcount=0;
//		//char t='';
//		
//		for(Map.Entry<Character, Integer> m:mp.entrySet()) {
//			
//			if(m.getValue()>maxcount) {
//				maxcount=m.getValue();
//				
//			}
//			
//		}
//		System.out.println(maxcount);
		}

}
