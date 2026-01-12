package CollectionCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class find2cndHighestOccurance {
	public static void main(String args[]) {
	

	String str = "Seellllliuuum";
	char m[] = str.toCharArray();

	Map <Character,Integer> mp=new HashMap<Character,Integer>();

	for (char t : m) {
		if (mp.containsKey(t)) {
			mp.put(t, mp.get(t) + 1);

		} else {
			mp.put(t, 1);
		}
	}
	System.out.println(mp);
	
	int max=0;int smax=0;char maxc=' ';char smaxc=' ';
	for(Entry<Character,Integer> ent:mp.entrySet()) {
		if(ent.getValue()>max) {
			smax=max;
			smaxc=maxc;
			max=ent.getValue();
			maxc=ent.getKey();
			
		}
		else if(ent.getValue()<max&&ent.getValue()>smax){
			smax=ent.getValue();
			smaxc=ent.getKey();
			
		}
		
	}
	System.out.println(smax +"   "+smaxc);
}
	
}


