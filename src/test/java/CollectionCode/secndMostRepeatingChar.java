package CollectionCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class secndMostRepeatingChar {

	public static void main(String[] args) {
	String str="Annnnkittta";
	//o/P t
	
	Map<Character,Integer> mp=new HashMap<Character,Integer>();
	char c[]=str.toCharArray();
	for(char m:c) {
		if(mp.containsKey(m)) {
			mp.put(m, mp.get(m)+1);
		}
		else {
			mp.put(m, 1);
		}
	}
	System.out.println(mp);
	
//	for(Entry <Character,Integer> mn:mp.entrySet()) {
//	
//		if(mn.getValue()>high) {
//			sechi=high;
//			sec=mn.getKey();
//			
//			high=mn.getValue();
//			hi=mn.getKey();
//			
//			
//		}
//		
//		
//	}
	
	Set<Character> st=mp.keySet();
	int high=0;
	int sechi=0;
	char hi=' ';
	char sec=' ';
for(char n:st) {
	if(mp.get(n)>high) {
		sechi=high;
		high=mp.get(n);
		
		
	}
}
	
	System.out.println(sechi +" "+sec);
	System.out.println(high);

	}

}
