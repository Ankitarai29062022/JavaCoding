package CollectionCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class sndHighestCoccArray {

	public static void main(String[] args) {
		String str="seeelllllllleniumeeem";
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		char c[]=str.toCharArray();
		for(char t:c) {
			if(mp.containsKey(t)) {
				mp.put(t, mp.get(t)+1);
			}
			else {
				mp.put(t, 1);
			}
		}
		System.out.println(mp);
		Set<Character> st=mp.keySet();
		int max=0;int smax=0;
		char maxv=' ';char smaxv=' ';
		for(char m:st) {
			if(mp.get(m)>max) {
				smax=max;
				smaxv=maxv;
				max=mp.get(m);
				maxv=m;
			}
			else if(mp.get(m)<max&&mp.get(m)>smax) {
				smax=mp.get(m);
				smaxv=m;
			}
		}
		System.out.println(smax +" "+smaxv);
		

	}

}
